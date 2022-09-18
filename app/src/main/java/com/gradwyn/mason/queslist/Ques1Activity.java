package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.gradwyn.mason.R;
import com.gradwyn.mason.util.Contexts;

import java.text.DateFormat;
import java.util.Date;

public class Ques1Activity extends AppCompatActivity {
    private Button next;
    private TextView view;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next1);
        seekBar = findViewById(R.id.ques1);
        view = findViewById(R.id.v1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Contexts.pro1 != null) {
                    Intent intent = new Intent(Ques1Activity.this, Ques2Activity.class);
                    startActivity(intent);
                    finish();
                } else {
                    //弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques1Activity.this);
                    builder1.setIcon(R.drawable.warn);
                    builder1.setTitle("Warnings");
                    builder1.setMessage("Please complete questions");
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });

        // 滑动条设置
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro1 = String.valueOf(progress);


                view.setText(Contexts.pro1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}