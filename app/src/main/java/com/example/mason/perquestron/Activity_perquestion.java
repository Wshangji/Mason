package com.example.mason.perquestron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                Intent intent = new Intent();
                intent.setClass(Activity_perquestion.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}