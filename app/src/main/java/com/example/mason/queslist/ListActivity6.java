package com.example.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.mason.R;

public class ListActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list6);
        getSupportActionBar().hide();       //隐藏标题栏
    }
}