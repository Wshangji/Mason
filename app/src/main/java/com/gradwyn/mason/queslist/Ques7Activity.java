package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.gradwyn.mason.R;
import com.gradwyn.mason.util.Contexts;

public class Ques7Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_ques7);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next7);

    }
}