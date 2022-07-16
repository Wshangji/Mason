 package com.gradwyn.mason.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.core.Amplify;
import com.gradwyn.mason.MainActivity;
import com.gradwyn.mason.R;

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;

public class LoginTabFragment extends Fragment {

    private ProgressDialog loadingDialog;

    EditText username,pass;
    TextView forgetPass;
    Button login;
    float v = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.login_tab_fragment,container,false);

        //获取标签元素
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

        //设置加载动画
        username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        forgetPass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();


        //登录点击事件
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = username.getText().toString();
                String upass = pass.getText().toString();

                if (uname=="" || uname.isEmpty()) {
                    Toast toast = Toast.makeText(getContext(), "Please enter username" ,Toast.LENGTH_SHORT);
                    toast.show();
                } else if (upass=="" || upass.isEmpty()){
                    Toast toast = Toast.makeText(getContext(), "Please enter password" ,Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    // 创建登陆加载动画
                    loadingDialog = new ProgressDialog(getContext());
                    // 点击空白不消失
                    loadingDialog.setCancelable(false);
                    loadingDialog.show();
                    loadingDialog.setContentView(R.layout.loading_view);
                    //AWS登录验证
                    Amplify.Auth.signIn(
                            uname,
                            upass,
                            this::onLoginSuccess,
                            this::onLoginError
                    );
                }

            }

            //登录成功事件
            private void onLoginSuccess(AuthSignInResult authSignInResult) {

                // 登陆加载动画消失
                loadingDialog.dismiss();
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), "Login Success" ,Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                jumpHome();
            }

            //登录失败事件
            private void onLoginError(AuthException e) {

                // 登陆加载动画消失
                loadingDialog.dismiss();
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), e.getMessage() ,Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
            }

            //跳转主页面
            private  void jumpHome(){
                Intent intent = new Intent();
                intent.setClass(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return root;
    }
}