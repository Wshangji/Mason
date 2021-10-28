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
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perquestion);

        submit = findViewById(R.id.pre_submit);

        radioGroup1 = findViewById(R.id.gender_group);
        radioGroup2 = findViewById(R.id.race_group);
        radioGroup3 = findViewById(R.id.eth_group);
        radioGroup4 = findViewById(R.id.ses_group);
        radioGroup5 = findViewById(R.id.emp_group);

        radioButton1 = findViewById(radioGroup1.getCheckedRadioButtonId());
        radioButton2 = findViewById(radioGroup2.getCheckedRadioButtonId());
        radioButton3 = findViewById(radioGroup3.getCheckedRadioButtonId());
        radioButton4 = findViewById(radioGroup4.getCheckedRadioButtonId());
        radioButton5 = findViewById(radioGroup5.getCheckedRadioButtonId());

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
                                .gender(radioButton1.getText().toString())
                                .race(radioButton2.getText().toString())
                                .ethnicity(radioButton3.getText().toString())
                                .ses(radioButton4.getText().toString())
                                .ethnicity(radioButton5.getText().toString())
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