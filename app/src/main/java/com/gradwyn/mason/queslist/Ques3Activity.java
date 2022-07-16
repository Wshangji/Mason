package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.gradwyn.mason.R;
import com.gradwyn.mason.util.Contexts;

public class Ques3Activity extends AppCompatActivity {
    private Button next;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques3);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next3);
        input = findViewById(R.id.ques3);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contexts.pro3 = input.getText().toString();
                if (Contexts.pro3 != null) {
                    Intent intent = new Intent(Ques3Activity.this, Ques4Activity.class);
                    startActivity(intent);
                    finish();
                } else {
                    //弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques3Activity.this);
                    builder1.setIcon(R.drawable.warn);
                    builder1.setTitle("Warnings");
                    builder1.setMessage("Please complete questions");
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });
    }
}