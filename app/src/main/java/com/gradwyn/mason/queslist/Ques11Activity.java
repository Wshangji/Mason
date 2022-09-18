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

public class Ques11Activity extends AppCompatActivity {
    private Button next;
    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private SeekBar seekBar3;
    private SeekBar seekBar4;
    private SeekBar seekBar5;

    private TextView view1;
    private TextView view2;
    private TextView view3;
    private TextView view4;
    private TextView view5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques11);
        getSupportActionBar().hide();

        // 控件绑定
        next = findViewById(R.id.ques_next11);
        seekBar1 = findViewById(R.id.ques11_1);
        seekBar2 = findViewById(R.id.ques11_2);
        seekBar3 = findViewById(R.id.ques11_3);
        seekBar4 = findViewById(R.id.ques11_4);
        seekBar5 = findViewById(R.id.ques11_5);
        view1 = findViewById(R.id.v11_1);
        view2 = findViewById(R.id.v11_2);
        view3 = findViewById(R.id.v11_3);
        view4 = findViewById(R.id.v11_4);
        view5 = findViewById(R.id.v11_5);

        // 按键事件绑定
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Contexts.pro11_1.equals("") && !Contexts.pro11_2.equals("") && !Contexts.pro11_3.equals("") && !Contexts.pro11_4.equals("") && !Contexts.pro11_5.equals("")) {
                    Intent intent = new Intent(Ques11Activity.this, Ques12Activity.class);
                    startActivity(intent);
                    finish();
                } else {
                    //弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques11Activity.this);
                    builder1.setIcon(R.drawable.warn);
                    builder1.setTitle("Warnings");
                    builder1.setMessage("Please complete questions");
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });

        // 滑动条事件
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro11_1 = String.valueOf(progress);
                view1.setText(Contexts.pro11_1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro11_2 = String.valueOf(progress);
                view2.setText(Contexts.pro11_2);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro11_3 = String.valueOf(progress);
                view3.setText(Contexts.pro11_3);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro11_4 = String.valueOf(progress);
                view4.setText(Contexts.pro11_4);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro11_5 = String.valueOf(progress);
                view5.setText(Contexts.pro11_5);
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