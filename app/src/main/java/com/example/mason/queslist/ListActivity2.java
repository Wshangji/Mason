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

public class ListActivity2 extends AppCompatActivity {
    private Button next;
    private String pro1;
    private String pro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next2);
        RadioGroup group2 = (RadioGroup) findViewById(R.id.group2);
        Intent data = getIntent();
        pro1 = data.getStringExtra("pro1");
        group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                pro2 = radioButton.getText().toString();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity2.this, ListActivity3.class);
                intent.putExtra("pro1",pro1);
                intent.putExtra("pro2",pro2);
                startActivity(intent);
            }
        });
    }
}