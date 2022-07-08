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

public class Ques9Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_ques9);
        getSupportActionBar().hide();       //隐藏标题栏
        createNotificationChannel();

        submit = findViewById(R.id.ques_submit);
        seekBar1 = findViewById(R.id.ques9_1);
        seekBar2 = findViewById(R.id.ques9_2);
        seekBar3 = findViewById(R.id.ques9_3);
        seekBar4 = findViewById(R.id.ques9_4);
        seekBar5 = findViewById(R.id.ques9_5);
        view1 = findViewById(R.id.v9_1);
        view2 = findViewById(R.id.v9_2);
        view3 = findViewById(R.id.v9_3);
        view4 = findViewById(R.id.v9_4);
        view5 = findViewById(R.id.v9_5);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Contexts.pro9_1 != null && Contexts.pro9_2 != null && Contexts.pro9_3 != null && Contexts.pro9_4 != null && Contexts.pro9_5 != null) {
                    Amplify.DataStore.save(
                            Questions.builder()
                                    .name(Amplify.Auth.getCurrentUser().getUsername())
                                    .pro1(Contexts.pro1)
                                    .pro2(Contexts.pro2)
                                    .pro3(Contexts.pro3)
                                    .pro4(Contexts.pro4)
                                    .pro5(Contexts.pro5)
                                    .pro6_1(Contexts.pro6_1)
                                    .pro6_2(Contexts.pro6_2)
                                    .pro7_1(Contexts.pro7_1)
                                    .pro7_2(Contexts.pro7_2)
                                    .pro7_3(Contexts.pro7_3)
                                    .pro7_4(Contexts.pro7_4)
                                    .pro8_1(Contexts.pro8_1)
                                    .pro8_2(Contexts.pro8_2)
                                    .pro8_3(Contexts.pro8_3)
                                    .pro8_4(Contexts.pro8_4)
                                    .pro8_5(Contexts.pro8_5)
                                    .pro9_1(Contexts.pro9_1)
                                    .pro9_2(Contexts.pro9_2)
                                    .pro9_3(Contexts.pro9_3)
                                    .pro9_4(Contexts.pro9_4)
                                    .pro9_5(Contexts.pro9_5)
                                    .build(),
                            this :: submitSuccess,
                            this :: submitError
                    );

                    // 添加定时通知
                    Intent intent = new Intent(Ques9Activity.this, ReminderBoard.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(Ques9Activity.this,0,intent,0);

                    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                    long timeAtButtonClick = System.currentTimeMillis();
                    long tenSecondsInMillis = 1000 * 60 * 24 * 7;
//                    long tenSecondsInMillis = 1000 * 2;
                    alarmManager.set(AlarmManager.RTC_WAKEUP,
                            timeAtButtonClick+tenSecondsInMillis,
                            pendingIntent);
                } else {
                    //弹出框
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(Ques9Activity.this);
                    builder1.setIcon(R.drawable.warn);
                    builder1.setTitle("Warnings");
                    builder1.setMessage("Please complete questions");
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }

            private void submitError(DataStoreException e) {
                Toast toast = Toast.makeText(Ques9Activity.this, "Submit error" ,Toast.LENGTH_LONG);
                toast.show();
            }

            private <T extends Model> void submitSuccess(DataStoreItemChange<T> tDataStoreItemChange) {
                Intent intent = new Intent(Ques9Activity.this, FinishActivity.class);
                startActivity(intent);
                finish();
            }
        });

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro9_1 = String.valueOf(progress);
                view1.setText(Contexts.pro9_1);
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
                Contexts.pro9_2 = String.valueOf(progress);
                view2.setText(Contexts.pro9_2);
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
                Contexts.pro9_3 = String.valueOf(progress);
                view3.setText(Contexts.pro9_3);
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
                Contexts.pro9_4 = String.valueOf(progress);
                view4.setText(Contexts.pro9_4);
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
                Contexts.pro9_5 = String.valueOf(progress);
                view5.setText(Contexts.pro9_5);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

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