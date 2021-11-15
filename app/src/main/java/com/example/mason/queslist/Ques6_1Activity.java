package com.example.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.amplifyframework.api.graphql.model.ModelQuery;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.generated.model.Perception;
import com.example.mason.R;
import com.example.mason.util.Contexts;

public class Ques6_1Activity extends AppCompatActivity {
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques6_1);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next6_1);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.ques6_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                Contexts.pro6_1 = radioButton.getText().toString();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Contexts.pro6_1!=null) {
                    if (Contexts.pro6_1.equals("Yes")){
                        Intent intent = new Intent(Ques6_1Activity.this, Ques6_2Activity.class);
                        startActivity(intent);
                    } else {
                        Amplify.DataStore.query(Perception.class, Where.id(Amplify.Auth.getCurrentUser().getUserId()),
                                matches -> {
                                    if (matches.hasNext()) {
                                        if (matches.next().getEigenstates()!=null && !matches.next().getEigenstates().equals("Not currently employed")){
                                            Intent intent = new Intent(Ques6_1Activity.this, Ques7Activity.class);
                                            startActivity(intent);
                                        } else {
                                            Intent intent = new Intent(Ques6_1Activity.this, Ques8Activity.class);
                                            startActivity(intent);
                                        }
//                                        runOnUiThread(new Runnable() {
//                                            public void run() {
//                                                final Toast toast = Toast.makeText(Ques6_1Activity.this, "matches.next().getEigenstates()",Toast.LENGTH_LONG);
//                                                toast.show();
//                                            }
//                                        });
                                    }
                                },
                                failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
                        );
                    }
                } else {
                    Amplify.DataStore.query(Perception.class, Where.id(Amplify.Auth.getCurrentUser().getUserId()),
                            matches -> {
                                if (matches.hasNext()) {
                                    if (matches.next().getEigenstates()!=null && !matches.next().getEigenstates().equals("Not currently employed")){
                                        Intent intent = new Intent(Ques6_1Activity.this, Ques7Activity.class);
                                        startActivity(intent);
                                    } else {
                                        Intent intent = new Intent(Ques6_1Activity.this, Ques8Activity.class);
                                        startActivity(intent);
                                    }
                                }
                            },
                            failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
                    );
                }
            }
        });
    }
}