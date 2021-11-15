package com.example.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mason.R;
import com.example.mason.util.Contexts;

public class Ques4Activity extends AppCompatActivity {
    private Button next;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques4);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next4);
        input = findViewById(R.id.ques4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contexts.pro4 = input.getText().toString();
                Intent intent = new Intent(Ques4Activity.this, Ques5Activity.class);
                startActivity(intent);
            }
        });
    }
}