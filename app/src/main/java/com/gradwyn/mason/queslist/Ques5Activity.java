package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.gradwyn.mason.R;
import com.gradwyn.mason.util.Contexts;

public class Ques5Activity extends AppCompatActivity {
    private Button next;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques5);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next5);
        radioGroup = findViewById(R.id.ques5_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                Contexts.pro5 = radioButton.getText().toString();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Contexts.pro5.equals("")) {
                    Intent intent = new Intent(Ques5Activity.this, Ques6_1Activity.class);
                    startActivity(intent);
                    finish();
                } else {
                    //弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques5Activity.this);
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