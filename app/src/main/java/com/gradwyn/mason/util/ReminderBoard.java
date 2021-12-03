package com.gradwyn.mason.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.amplifyframework.core.Amplify;
import com.gradwyn.mason.R;

public class ReminderBoard extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"notifyLemubit")
                .setSmallIcon(R.drawable.ic_message_24)
                .setContentTitle("Hi,"+ Amplify.Auth.getCurrentUser().getUsername()+"!")
                .setContentText("Don’t forget to check in on Gradwyn for your weekly survey. You increase your earnings with each survey you complete.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);

        // notificationId is a unique int for each notification that you must define
        int notificationId = 1;
        notificationManager.notify(notificationId, builder.build());
    }
}