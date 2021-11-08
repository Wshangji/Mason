package com.example.mason.queslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.amplifyframework.datastore.generated.model.Questions;
import com.example.mason.FinishActivity;
import com.example.mason.R;

public class ListActivity10 extends AppCompatActivity {
    private Button submit;
    private EditText input;
    private String pro1;
    private String pro2;
    private String pro3;
    private String pro4;
    private String pro5;
    private String pro6;
    private String pro7;
    private String pro8;
    private String pro9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list10);
        getSupportActionBar().hide();       //隐藏标题栏
        submit = findViewById(R.id.ques_submit);
        input = findViewById(R.id.group10);
        Intent data = getIntent();
        pro1 = data.getStringExtra("pro1");
        pro2 = data.getStringExtra("pro2");
        pro3 = data.getStringExtra("pro3");
        pro4 = data.getStringExtra("pro4");
        pro5 = data.getStringExtra("pro5");
        pro6 = data.getStringExtra("pro6");
        pro7 = data.getStringExtra("pro7");
        pro8 = data.getStringExtra("pro8");
        pro9 = data.getStringExtra("pro9");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Amplify.DataStore.save(
                        Questions.builder()
                                .name(Amplify.Auth.getCurrentUser().getUsername())
                                .pro1(pro1)
                                .pro2(pro2)
                                .pro3(pro3)
                                .pro4(pro4)
                                .pro5(pro5)
                                .pro6(pro6)
                                .pro7(pro7)
                                .pro8(pro8)
                                .pro9(pro9)
                                .pro10(input.getText().toString())
                                .build(),
                        this :: submitSuccess,
                        this :: submitError
                );
            }

            private void submitError(DataStoreException e) {
                Toast toast = Toast.makeText(ListActivity10.this, "Submit error" ,Toast.LENGTH_LONG);
                toast.show();
            }

            private <T extends Model> void submitSuccess(DataStoreItemChange<T> tDataStoreItemChange) {
                Intent intent = new Intent(ListActivity10.this, FinishActivity.class);
                startActivity(intent);
            }
        });
    }
}