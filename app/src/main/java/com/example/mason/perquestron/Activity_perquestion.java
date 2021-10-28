package com.example.mason.perquestron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.generated.model.Perception;
import com.amplifyframework.datastore.generated.model.User;
import com.example.mason.MainActivity;
import com.example.mason.R;

public class Activity_perquestion extends AppCompatActivity {
    private Button submit;

    private String gender = null;
    private String race = null;
    private String ethnicity = null;
    private String ses = null;
    private String eigenstates = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perquestion);

        submit = findViewById(R.id.pre_submit);

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.gender_group);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.race_group);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.eth_group);
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.ses_group);
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.emp_group);

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


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = getIntent().getStringExtra("username");
                String userId = Amplify.Auth.getCurrentUser().getUserId();
                Amplify.DataStore.save(
                        User.builder().id(userId).name(username).build(),
                        success -> Log.i("MyAmplifyApp", "Saved a User."),
                        failure -> Log.e("MyAmplifyApp", "Save failed.", failure)
                );

                Amplify.DataStore.save(
                        Perception.builder()
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
            }
        });
    }
}