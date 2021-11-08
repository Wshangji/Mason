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

public class ListActivity3 extends AppCompatActivity {
    private Button next;
    private String pro1;
    private String pro2;
    private String pro3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next3);
        Intent data = getIntent();
        pro1 = data.getStringExtra("pro1");
        pro2 = data.getStringExtra("pro2");
        RadioGroup group3 = (RadioGroup) findViewById(R.id.group3);
        group3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                pro3 = radioButton.getText().toString();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListActivity3.this, ListActivity4.class);
                intent.putExtra("pro1",pro1);
                intent.putExtra("pro2",pro2);
                intent.putExtra("pro3",pro3);
                startActivity(intent);
            }
        });
    }
}