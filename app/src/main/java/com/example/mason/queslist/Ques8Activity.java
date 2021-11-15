package com.example.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.mason.R;
import com.example.mason.util.Contexts;

public class Ques8Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_ques8);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next8);
        seekBar1 = findViewById(R.id.ques8_1);
        seekBar2 = findViewById(R.id.ques8_2);
        seekBar3 = findViewById(R.id.ques8_3);
        seekBar4 = findViewById(R.id.ques8_4);
        seekBar5 = findViewById(R.id.ques8_5);
        view1 = findViewById(R.id.v_1);
        view2 = findViewById(R.id.v_2);
        view3 = findViewById(R.id.v_3);
        view4 = findViewById(R.id.v_4);
        view5 = findViewById(R.id.v_5);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ques8Activity.this, Ques9Activity.class);
                startActivity(intent);
            }
        });

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro8_1 = String.valueOf(progress);
                view1.setText(Contexts.pro8_1);
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
                Contexts.pro8_2 = String.valueOf(progress);
                view2.setText(Contexts.pro8_2);
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
                Contexts.pro8_3 = String.valueOf(progress);
                view3.setText(Contexts.pro8_3);
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
                Contexts.pro8_4 = String.valueOf(progress);
                view4.setText(Contexts.pro8_4);
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
                Contexts.pro8_5 = String.valueOf(progress);
                view5.setText(Contexts.pro8_5);
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