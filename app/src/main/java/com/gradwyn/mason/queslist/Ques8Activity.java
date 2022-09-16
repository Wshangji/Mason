package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
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

public class Ques8Activity extends AppCompatActivity {
    private Button next;
    private RadioGroup radioGroup;
    private ProgressDialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques8);
        getSupportActionBar().hide();       //隐藏标题栏
        next = findViewById(R.id.ques_next8);
        radioGroup = findViewById(R.id.ques8_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                Contexts.pro8 = radioButton.getText().toString();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Contexts.pro8 != null) {
                    // 创建登陆加载动画
                    loadingDialog = new ProgressDialog(Ques8Activity.this);
                    // 点击空白不消失
                    loadingDialog.setCancelable(false);
                    loadingDialog.show();
                    loadingDialog.setContentView(R.layout.loading_view);

                    Amplify.DataStore.query(
                            Perception.class,
                            Where.matches(Perception.NAME.eq(Amplify.Auth.getCurrentUser().getUsername())),
                            matches -> {
                                if (matches.hasNext()) {
                                    Perception perception = matches.next();
                                    Log.d("Amplify Query", "persion: " + perception);
                                    if (perception.getEigenstates()!=null && !perception.getEigenstates().equals("No")){
                                        // 登陆加载动画消失
                                        loadingDialog.dismiss();
                                        Intent intent = new Intent(Ques8Activity.this, Ques9Activity.class);
                                        startActivity(intent);
                                        finish();
                                    } else {

                                        if (perception.getEmploys()!=null && !perception.getEmploys().equals("Not currently employed")) {
                                            // 登陆加载动画消失
                                            loadingDialog.dismiss();
                                            Intent intent = new Intent(Ques8Activity.this, Ques10Activity.class);
                                            startActivity(intent);
                                            finish();
                                        } else {
                                            // 登陆加载动画消失
                                            loadingDialog.dismiss();
                                            Intent intent = new Intent(Ques8Activity.this, Ques11Activity.class);
                                            startActivity(intent);
                                            finish();
                                        }
                                    }
                                } else {
                                    // 登陆加载动画消失
                                    loadingDialog.dismiss();
                                    //弹出框
                                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques8Activity.this);
                                    builder1.setIcon(R.drawable.error);
                                    builder1.setTitle("Error");
                                    builder1.setMessage("Please check your account information");
                                    AlertDialog alert11 = builder1.create();
                                    alert11.show();
                                }
                            },
                            failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
                    );
                } else {
                    // 登陆加载动画消失
                    loadingDialog.dismiss();
                    //弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques8Activity.this);
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