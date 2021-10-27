package com.example.mason.perquestron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.generated.model.Perception;
import com.example.mason.MainActivity;
import com.example.mason.R;

public class Activity_perquestion extends AppCompatActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perquestion);

        submit = findViewById(R.id.pre_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Perception.BuildStep perception = Perception.builder()
//                        .gender("wffwe")
//                        .race("fwefwgf")
//                        .ethnicity("fwegwg")
//                        .ses("fwgwgw")
//                        .eigenstates("wgwewg");

                Intent intent = new Intent();
                intent.setClass(Activity_perquestion.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}