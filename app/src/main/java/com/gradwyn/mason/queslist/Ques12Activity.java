package com.gradwyn.mason.queslist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.amplifyframework.datastore.generated.model.Questions;
import com.gradwyn.mason.FinishActivity;
import com.gradwyn.mason.R;
import com.gradwyn.mason.util.Contexts;
import com.gradwyn.mason.util.ReminderBoard;

public class Ques12Activity extends AppCompatActivity {
    private Button submit;
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
        setContentView(R.layout.activity_ques12);
        getSupportActionBar().hide();
        createNotificationChannel();

        // 控件绑定
        submit = findViewById(R.id.ques_submit);
        seekBar1 = findViewById(R.id.ques12_1);
        seekBar2 = findViewById(R.id.ques12_2);
        seekBar3 = findViewById(R.id.ques12_3);
        seekBar4 = findViewById(R.id.ques12_4);
        seekBar5 = findViewById(R.id.ques12_5);
        view1 = findViewById(R.id.v12_1);
        view2 = findViewById(R.id.v12_2);
        view3 = findViewById(R.id.v12_3);
        view4 = findViewById(R.id.v12_4);
        view5 = findViewById(R.id.v12_5);

        // 提交按钮绑定事件
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Contexts.pro12_1 != null && Contexts.pro12_2 != null && Contexts.pro12_3 != null && Contexts.pro12_4 != null && Contexts.pro12_5 != null) {
                    Log.d("数据上传","数据开始上传");
                    Amplify.DataStore.save(
                            Questions.builder()
                                    .name(Amplify.Auth.getCurrentUser().getUsername())
                                    .build(),
                            this :: submitSuccess,
                            this :: submitError
                    );

                    // 添加定时通知
                    Intent intent = new Intent(Ques12Activity.this, ReminderBoard.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(Ques12Activity.this,0,intent,0);

                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                    long timeAtButtonClick = System.currentTimeMillis();
                    long tenSecondsInMillis = 1000 * 60 * 24 * 7;
//                    long tenSecondsInMillis = 1000 * 2;
                    alarmManager.set(AlarmManager.RTC_WAKEUP,
                            timeAtButtonClick+tenSecondsInMillis,
                            pendingIntent);
                } else {
                    // 弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques12Activity.this);
                    builder1.setIcon(R.drawable.warn);
                    builder1.setTitle("Warnings");
                    builder1.setMessage("Please complete questions");
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }

            private void submitError(DataStoreException e) {
                Toast toast = Toast.makeText(Ques12Activity.this, "Submit error" ,Toast.LENGTH_LONG);
                toast.show();
            }

            private <T extends Model> void submitSuccess(DataStoreItemChange<T> tDataStoreItemChange) {
                Intent intent = new Intent(Ques12Activity.this, FinishActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // 滑动条设置
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro12_1 = String.valueOf(progress);
                view1.setText(Contexts.pro12_1);
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
                Contexts.pro12_2 = String.valueOf(progress);
                view2.setText(Contexts.pro12_2);
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
                Contexts.pro12_3 = String.valueOf(progress);
                view3.setText(Contexts.pro12_3);
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
                Contexts.pro12_4 = String.valueOf(progress);
                view4.setText(Contexts.pro12_4);
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
                Contexts.pro12_5 = String.valueOf(progress);
                view5.setText(Contexts.pro12_5);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    // 创建消息通知
    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("notifyLemubit", name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}