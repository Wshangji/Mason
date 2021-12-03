package com.gradwyn.mason.perquestron;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.generated.model.Perception;
import com.amplifyframework.datastore.generated.model.User;
import com.gradwyn.mason.LoginActivity;
import com.gradwyn.mason.MainActivity;
import com.gradwyn.mason.R;

public class Activity_perquestion extends AppCompatActivity {
    private Button submit;
    private String username;
    private String userId;

    private String gender = null;
    private String race = null;
    private String ethnicity = null;
    private String ses = null;
    private String eigenstates = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perquestion);

        //获取页面标签
        submit = findViewById(R.id.pre_submit);

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.gender_group);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.race_group);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.eth_group);
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.ses_group);
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.emp_group);

        //弹出框
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(getResources().getText(R.string.content));
        //点击空白不消失
        builder1.setCancelable(false);
        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Amplify.Auth.signOut(
                                AuthSignOutOptions.builder().globalSignOut(true).build(),
                                () -> Log.i("AuthQuickstart", "Signed out globally"),
                                error -> Log.e("AuthQuickstart", error.toString())
                        );
                        Intent intent = new Intent(Activity_perquestion.this, LoginActivity.class);
                        startActivity(intent);
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();


        //获取单选值
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                gender = radioButton.getText().toString();
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                race = radioButton.getText().toString();
            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                ethnicity = radioButton.getText().toString();
            }
        });

        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                ses = radioButton.getText().toString();
            }
        });

        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                eigenstates = radioButton.getText().toString();
            }
        });


        //提交事件
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = Amplify.Auth.getCurrentUser().getUsername();
                userId = Amplify.Auth.getCurrentUser().getUserId();
                Amplify.DataStore.save(
                        User.builder()
                                .id(userId)
                                .name(username)
                                .isAgree(true)
                                .build(),
                        success -> Log.i("MyAmplifyApp", "Saved a User."),
                        failure -> Log.e("MyAmplifyApp", "Save failed.", failure)
                );
                Amplify.DataStore.save(
                        Perception.builder()
                                .id(userId)
                                .name(username)
                                .gender(gender)
                                .race(race)
                                .ethnicity(ethnicity)
                                .ses(ses)
                                .eigenstates(eigenstates)
                                .build(),
                        result -> Log.i("MyAmplifyApp", "Created a new post successfully"),
                        error -> Log.e("MyAmplifyApp",  "Error creating post", error)
                );

                Intent intent = new Intent();
                intent.setClass(Activity_perquestion.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}