package com.example.mason.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.core.Amplify;
import com.example.mason.LoginActivity;
import com.example.mason.MainActivity;
import com.example.mason.R;
import com.example.mason.perquestron.Activity_perquestion;

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;

public class SignupTabFragment extends Fragment {

    EditText email,username,password,comfim,code;
    Button signup,send;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.signup_fragment,container,false);

        final MyCountDownTimer myCountDownTimer = new MyCountDownTimer(60000,1000);
        username = root.findViewById(R.id.Username);
        password = root.findViewById(R.id.Password);
        email = root.findViewById(R.id.Email);
        comfim = root.findViewById(R.id.confirm);
        code = root.findViewById(R.id.code);
        signup = root.findViewById(R.id.signup);
        send = root.findViewById(R.id.send);

        email.setTranslationY(800);
        password.setTranslationY(800);
        username.setTranslationY(800);
        comfim.setTranslationY(800);
        code.setTranslationY(800);
        signup.setTranslationY(800);
        send.setTranslationY(800);

        email.setAlpha(v);
        password.setAlpha(v);
        username.setAlpha(v);
        comfim.setAlpha(v);
        code.setAlpha(v);
        signup.setAlpha(v);
        send.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        comfim.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        code.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        send.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
        signup.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().equals(comfim.getText().toString())) {
                    AuthSignUpOptions options = AuthSignUpOptions.builder()
                            .userAttribute(AuthUserAttributeKey.email(), email.getText().toString())
                            .build();
                    Amplify.Auth.signUp(username.getText().toString(), password.getText().toString(), options,
                            result -> Log.i("AuthQuickStart", "Result: " + result.toString()),
                            this::signUpError
                    );
                    myCountDownTimer.start();
                } else {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            final Toast toast = Toast.makeText(getContext(), "Password input is inconsistent" ,Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    });
                }
            }

            private void signUpError(AuthException e) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), e.getMessage() ,Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Amplify.Auth.confirmSignUp(
                        username.getText().toString(),
                        code.getText().toString(),
                        this::onJoinSuccess,
                        this::OnjoinError
                );
            }

            private void OnjoinError(AuthException e) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), e.getMessage() ,Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
            }

            private void onJoinSuccess(AuthSignUpResult authSignUpResult) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), "Registration Success" ,Toast.LENGTH_LONG);
                        toast.show();
                    }
                });

                Amplify.Auth.signIn(
                        username.getText().toString(),
                        password.getText().toString(),
                        result -> Log.i("AuthQuickstart", result.isSignInComplete() ? "Sign in succeeded" : "Sign in not complete"),
                        error -> Log.e("AuthQuickstart", error.toString())
                );

                Intent intent = new Intent();
                intent.setClass(getActivity(), Activity_perquestion.class);
                intent.putExtra("username",username.getText().toString());
                startActivity(intent);
            }
        });

        return root;
    }



    //倒计时函数
    private class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        //计时过程
        @Override
        public void onTick(long l) {
            //防止计时过程中重复点击
            send.setClickable(false);
            send.setText(l/1000+"s");

        }

        //计时完毕的方法
        @Override
        public void onFinish() {
            //重新给Button设置文字
            send.setText("Reacquire");
            //设置可点击
            send.setClickable(true);
        }
    }

}
