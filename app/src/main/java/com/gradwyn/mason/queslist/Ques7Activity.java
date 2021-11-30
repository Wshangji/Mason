package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.gradwyn.mason.R;
import com.gradwyn.mason.util.Contexts;

public class Ques7Activity extends AppCompatActivity {
    private Button next;
    private EditText input1;
    private EditText input2 ;
    private EditText input3;
    private EditText input4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques7);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next7);
        input1 = findViewById(R.id.ques7_1);
        input2 = findViewById(R.id.ques7_2);
        input3 = findViewById(R.id.ques7_3);
        input4 = findViewById(R.id.ques7_4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contexts.pro7_1 = input1.getText().toString();
                Contexts.pro7_2 = input2.getText().toString();
                Contexts.pro7_3 = input3.getText().toString();
                Contexts.pro7_4 = input4.getText().toString();
                Intent intent = new Intent(Ques7Activity.this, Ques8Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}