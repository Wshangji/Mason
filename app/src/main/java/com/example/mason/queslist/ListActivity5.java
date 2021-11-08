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

public class ListActivity5 extends AppCompatActivity {
    private Button next;
    private String pro1;
    private String pro2;
    private String pro3;
    private String pro4;
    private String pro5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list5);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next5);
        RadioGroup group5 = (RadioGroup) findViewById(R.id.group5);
        group5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                pro5 = radioButton.getText().toString();
            }
        });
        Intent data = getIntent();
        pro1 = data.getStringExtra("pro1");
        pro2 = data.getStringExtra("pro2");
        pro3 = data.getStringExtra("pro3");
        pro4 = data.getStringExtra("pro4");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity5.this, ListActivity6.class);
                intent.putExtra("pro1",pro1);
                intent.putExtra("pro2",pro2);
                intent.putExtra("pro3",pro3);
                intent.putExtra("pro4",pro4);
                intent.putExtra("pro5",pro5);
                startActivity(intent);
            }
        });
    }
}