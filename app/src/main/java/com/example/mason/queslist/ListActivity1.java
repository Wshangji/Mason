package com.example.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.mason.R;
import com.example.mason.util.Contexts;

public class ListActivity1 extends AppCompatActivity {
    private Button next;
    private String pro1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);
        getSupportActionBar().hide();       //隐藏标题栏

        next = findViewById(R.id.ques_next1);
        RadioGroup group1 = (RadioGroup) findViewById(R.id.group1);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                pro1 = radioButton.getText().toString();
            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity1.this, ListActivity2.class);
                intent.putExtra("pro1",pro1);
                startActivity(intent);
            }
        });
    }
}