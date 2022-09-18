package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.gradwyn.mason.R;
import com.gradwyn.mason.util.Contexts;

public class Ques10Activity extends AppCompatActivity {
    private Button next;
    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    private ArrayAdapter<String> adapter = null;
    private static final String [] listall ={
            "one time",
            "two times",
            "three times",
            "four times",
            "five times",
            "six times",
            "seven times",
            "more than seven times"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques10);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next10);

        spinner1 = findViewById(R.id.spinner_1);
        spinner2 = findViewById(R.id.spinner_2);
        spinner3 = findViewById(R.id.spinner_3);
        spinner4 = findViewById(R.id.spinner_4);



        adapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item,listall);
        //设置下拉列表风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //将适配器添加到spinner中去
        spinner1.setAdapter(adapter);
        spinner1.setVisibility(View.VISIBLE);//设置默认显示
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Contexts.pro10_1 = listall[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner2.setAdapter(adapter);
        spinner2.setVisibility(View.VISIBLE);//设置默认显示
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Contexts.pro10_2 = listall[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner3.setAdapter(adapter);
        spinner3.setVisibility(View.VISIBLE);//设置默认显示
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Contexts.pro10_3 = listall[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner4.setAdapter(adapter);
        spinner4.setVisibility(View.VISIBLE);//设置默认显示
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Contexts.pro10_4 = listall[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Contexts.pro10_1.equals("") && !Contexts.pro10_2.equals("") && !Contexts.pro10_3.equals("") && !Contexts.pro10_4.equals("")) {
                    Intent intent = new Intent(Ques10Activity.this, Ques11Activity.class);
                    startActivity(intent);
                    finish();
                } else {
                    //弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques10Activity.this);
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