//package com.gradwyn.mason.queslist;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.SeekBar;
//import android.widget.TextView;
//
//import com.gradwyn.mason.R;
//import com.gradwyn.mason.util.Contexts;
//
//public class Ques1Activity extends AppCompatActivity {
//    private Button next;
//    private TextView textView;
//    private SeekBar seekBar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ques1);
//        getSupportActionBar().hide();       //隐藏标题栏
//        next = findViewById(R.id.ques_next1);
//        textView = findViewById(R.id.seek_view);
//        seekBar = findViewById(R.id.ques1_seekbar);
//
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                Contexts.pro1 = String.valueOf(progress);
//                textView.setText(Contexts.pro1);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Ques1Activity.this, Ques2Activity.class);
//                startActivity(intent);
//            }
//        });
//    }
//}