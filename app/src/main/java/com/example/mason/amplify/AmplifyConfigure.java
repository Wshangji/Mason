package com.example.mason.amplify;

import android.app.Application;
import android.util.Log;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;

public class AmplifyConfigure extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            Amplify.configure(getApplicationContext());
            Log.i("Mason", "Initialized Amplify");
        } catch (AmplifyException e) {
            Log.e("Mason", "Could not initialize Amplify", e);
        }
    }
}
