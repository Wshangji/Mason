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

public class ListActivity9 extends AppCompatActivity {
    private Button next;
    private String pro1;
    private String pro2;
    private String pro3;
    private String pro4;
    private String pro5;
    private String pro6;
    private String pro7;
    private String pro8;
    private String pro9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list9);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next9);
        RadioGroup group9 = (RadioGroup) findViewById(R.id.group9);
        group9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                pro9 = radioButton.getText().toString();
            }
        });
        Intent data = getIntent();
        pro1 = data.getStringExtra("pro1");
        pro2 = data.getStringExtra("pro2");
        pro3 = data.getStringExtra("pro3");
        pro4 = data.getStringExtra("pro4");
        pro5 = data.getStringExtra("pro5");
        pro6 = data.getStringExtra("pro6");
        pro7 = data.getStringExtra("pro7");
        pro8 = data.getStringExtra("pro8");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity9.this, ListActivity10.class);
                intent.putExtra("pro1",pro1);
                intent.putExtra("pro2",pro2);
                intent.putExtra("pro3",pro3);
                intent.putExtra("pro4",pro4);
                intent.putExtra("pro5",pro5);
                intent.putExtra("pro6",pro6);
                intent.putExtra("pro7",pro7);
                intent.putExtra("pro8",pro8);
                intent.putExtra("pro9",pro9);
                startActivity(intent);
            }
        });
    }
}