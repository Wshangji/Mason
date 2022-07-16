package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.generated.model.Perception;
import com.gradwyn.mason.R;
import com.gradwyn.mason.util.Contexts;

public class Ques6_2Activity extends AppCompatActivity {
    private Button next;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques6_2);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next6_2);
        radioGroup = findViewById(R.id.ques6_2_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                Contexts.pro6_2 = radioButton.getText().toString();
                if (Contexts.pro6_2 == null) {
                    Contexts.pro6_2 = "";
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Contexts.pro6_2 != null) {
                    Amplify.DataStore.query(
                            Perception.class,
                            Where.matches(Perception.NAME.eq(Amplify.Auth.getCurrentUser().getUsername())),
                            matches -> {
                                if (matches.hasNext()) {
                                    Perception perception = matches.next();
                                    Log.i("Amplify Query", "persion: " + perception);
                                    if (perception.getEigenstates()!=null && !perception.getEigenstates().equals("Not currently employed")){
                                        Intent intent = new Intent(Ques6_2Activity.this, Ques7Activity.class);
                                        startActivity(intent);
                                        finish();
                                    } else {
                                        Intent intent = new Intent(Ques6_2Activity.this, Ques8Activity.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                } else {
                                    Intent intent = new Intent(Ques6_2Activity.this, Ques8Activity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            },
                            failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
                    );
                } else {
                    //弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques6_2Activity.this);
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