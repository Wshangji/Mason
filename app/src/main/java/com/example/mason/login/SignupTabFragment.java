package com.example.mason.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.core.Amplify;
import com.example.mason.LoginActivity;
import com.example.mason.MainActivity;
import com.example.mason.R;

public class SignupTabFragment extends Fragment {

    EditText email,username,password,comfim,code;
    Button signup,send;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.signup_fragment,container,false);

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
                String emailString = email.getText().toString();
                String userName = username.getText().toString();
                String pwd = password.getText().toString();
                String comfimPwd = comfim.getText().toString();

                AuthSignUpOptions options = AuthSignUpOptions.builder()
                        .userAttribute(AuthUserAttributeKey.email(), emailString)
                        .build();
                Amplify.Auth.signUp(userName, pwd, options,
                        result -> Log.i("AuthQuickStart", "Result: " + result.toString()),
                        error -> Log.e("AuthQuickStart", "Sign up failed", error)
                );
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String codeString = code.getText().toString();
                String userName = username.getText().toString();

                Amplify.Auth.confirmSignUp(
                        userName,
                        codeString,
                        result -> Log.i("AuthQuickstart", result.isSignUpComplete() ? "Confirm signUp succeeded" : "Confirm sign up not complete"),
                        error -> Log.e("AuthQuickstart", error.toString())
                );
            }
        });

        return root;
    }
}
