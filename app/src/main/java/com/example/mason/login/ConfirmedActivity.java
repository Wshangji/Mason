package com.example.mason.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mason.R;

public class ConfirmedActivity extends AppCompatActivity {
    private EditText table;
    private Button send;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmed);
        getSupportActionBar().hide();       //隐藏标题栏
        table = findViewById(R.id.confirm_code);
        send = findViewById(R.id.confirm_send);
        submit = findViewById(R.id.confirm_submit);
    }
}