package com.example.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mason.FinishActivity;
import com.example.mason.R;

public class ListActivity10 extends AppCompatActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list10);
        getSupportActionBar().hide();       //隐藏标题栏
        submit = findViewById(R.id.ques_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListActivity10.this, FinishActivity.class);
                startActivity(intent);
            }
        });
    }
}