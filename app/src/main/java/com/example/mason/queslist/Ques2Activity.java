package com.example.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.amplifyframework.datastore.generated.model.Questions;
import com.example.mason.R;
import com.example.mason.util.Contexts;

import java.util.ArrayList;

public class Ques2Activity extends AppCompatActivity {
    private Button next;
    private CheckBox ck1;
    private CheckBox ck2;
    private CheckBox ck3;
    private CheckBox ck4;
    private CheckBox ck5;
    private CheckBox ck6;
    private CheckBox ck7;
    private CheckBox ck8;
    private ArrayList<String> resule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next2);
        ck1 = findViewById(R.id.ck_1);
        ck2 = findViewById(R.id.ck_2);
        ck3 = findViewById(R.id.ck_3);
        ck4 = findViewById(R.id.ck_4);
        ck5 = findViewById(R.id.ck_5);
        ck6 = findViewById(R.id.ck_6);
        ck7 = findViewById(R.id.ck_7);
        ck8 = findViewById(R.id.ck_8);
        resule = new ArrayList<>();

        ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck1.isChecked()) {
                    resule.add("1");
                } else {
                    resule.remove("1");
                }
            }
        });
        ck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck2.isChecked()) {
                    resule.add("2");
                } else {
                    resule.remove("2");
                }
            }
        });
        ck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck3.isChecked()) {
                    resule.add("3");
                } else {
                    resule.remove("3");
                }
            }
        });
        ck4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck4.isChecked()) {
                    resule.add("4");
                } else {
                    resule.remove("4");
                }
            }
        });
        ck5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck5.isChecked()) {
                    resule.add("5");
                } else {
                    resule.remove("5");
                }
            }
        });
        ck6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck6.isChecked()) {
                    resule.add("6");
                } else {
                    resule.remove("6");
                }
            }
        });
        ck7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck7.isChecked()) {
                    resule.add("7");
                } else {
                    resule.remove("7");
                }
            }
        });
        ck8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ck8.isChecked()) {
                    resule.add("8");
                } else {
                    resule.remove("8");
                }
            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String t: resule
                     ) {
                    Contexts.pro2+=t;
                }
                Intent intent = new Intent(Ques2Activity.this, Ques3Activity.class);
                startActivity(intent);
            }
        });
    }
}