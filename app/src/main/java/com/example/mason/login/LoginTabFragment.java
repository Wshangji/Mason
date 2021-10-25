package com.example.mason.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.amplifyframework.core.Amplify;
import com.example.mason.MainActivity;
import com.example.mason.R;

public class LoginTabFragment extends Fragment {

    EditText username,pass;
    TextView forgetPass;
    Button login;
    boolean isLogin;
    float v = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.login_tab_fragment,container,false);

        pass = root.findViewById(R.id.pass);
        login = root.findViewById(R.id.login);
        username = root.findViewById(R.id.user);
        forgetPass = root.findViewById(R.id.forgetPass);

        username.setTranslationY(800);
        pass.setTranslationY(800);
        forgetPass.setTranslationY(800);
        login.setTranslationY(800);

        username.setAlpha(v);
        pass.setAlpha(v);
        forgetPass.setAlpha(v);
        login.setAlpha(v);

        username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
        forgetPass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userString = username.getText().toString();
                String passString = pass.getText().toString();
                Intent intent = new Intent();
                Amplify.Auth.signIn(
                        userString,
                        passString,
                        result -> Log.i("AuthQuickstart", String.valueOf(isLogin = result.isSignInComplete())),
                        error -> Log.e("AuthQuickstart", error.toString())
                );
                if (isLogin) {
                    intent.setClass(getActivity(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        return root;
    }
}
