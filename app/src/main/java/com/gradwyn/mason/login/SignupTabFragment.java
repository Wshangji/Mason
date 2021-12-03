package com.gradwyn.mason.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.core.Amplify;
import com.gradwyn.mason.R;
import com.gradwyn.mason.perquestron.Activity_perquestion;
import com.gradwyn.mason.util.VerifyUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;

public class SignupTabFragment extends Fragment {

    EditText email,username,password,comfim,code;
    Button signup,send;
    float v = 0;
    private Boolean flag = true;
    String uName, uPassword, uComPass, uEmail;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.signup_fragment,container,false);

        final MyCountDownTimer myCountDownTimer = new MyCountDownTimer(5*60*1000,1000);

        //获取页面标签
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

        //页面元素进入动画
        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        comfim.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        code.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        send.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        username.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(700).start();
        signup.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();

        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                flag = true;
            }
        });

        //发送验证码事件
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uName = username.getText().toString();
                uPassword = password.getText().toString();
                uComPass = comfim.getText().toString();
                uEmail = email.getText().toString();

                if (uName.isEmpty() || uName=="") {
                    // 请输入输入完整信息
                    runOnUiThread(new Runnable() {
                        public void run() {
                            final Toast toast = Toast.makeText(getContext(), "Please enter Name." ,Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    });

                } else if (uPassword.isEmpty() || uPassword=="") {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            final Toast toast = Toast.makeText(getContext(), "Please enter Password." ,Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    });

                } else if (uEmail.isEmpty() || uEmail=="") {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            final Toast toast = Toast.makeText(getContext(), "Please enter Email." ,Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    });

                } else if (uComPass.isEmpty() || uComPass=="") {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            final Toast toast = Toast.makeText(getContext(), "Please enter Confirm Password." ,Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    });

                } else if (!VerifyUtil.isEmail(uEmail)) {
                    // 邮箱地址错误
                    runOnUiThread(new Runnable() {
                        public void run() {
                            final Toast toast = Toast.makeText(getContext(), "Please enter an e-mail address in the format username@domain.com." ,Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    });

                } else if (!VerifyUtil.passwordVerify(uPassword)) {
                    // 密码长度低于8位
                    runOnUiThread(new Runnable() {
                        public void run() {
                            final Toast toast = Toast.makeText(getContext(), "Use 8 characters or more for your password." ,Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    });

                } else if (!uPassword.equals(uComPass)) {
                    // 两次输入密码不相同
                    runOnUiThread(new Runnable() {
                        public void run() {
                            final Toast toast = Toast.makeText(getContext(), "Those passwords didn’t match. Try again." ,Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    });

                }  else {
                    if (flag) {
                        AuthSignUpOptions options = AuthSignUpOptions.builder()
                                .userAttribute(AuthUserAttributeKey.email(), uEmail)
                                .build();

                        Amplify.Auth.signUp(uName, uPassword, options,
                                 this::signUpSuccess,
                                this::signUpError
                        );
                    } else {
                        Amplify.Auth.resendUserAttributeConfirmationCode(AuthUserAttributeKey.email(),
                                result -> Log.i("AuthDemo", "Code was sent again: " + result.toString()),
                                error -> Log.e("AuthDemo", "Failed to resend code.", error)
                        );
                    }
                }
            }

            //验证码发送成功
            private void signUpSuccess(AuthSignUpResult authSignUpResult) {
                myCountDownTimer.start();
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), "A verification code has been sent." ,Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
            }

            //验证码发送失败
            private void signUpError(AuthException e) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), e.getMessage() ,Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
            }
        });

        //注册事件
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Amplify.Auth.confirmSignUp(
                        uName,
                        code.getText().toString(),
                        this::onJoinSuccess,
                        this::OnjoinError
                );
            }

            //注册失败事件
            private void OnjoinError(AuthException e) {
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), e.getMessage() ,Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
            }

            //注册成功事件
            private void onJoinSuccess(AuthSignUpResult authSignUpResult) {

                Amplify.Auth.signIn(
                        uName,
                        uPassword,
                        result -> Log.i("AuthQuickstart", result.isSignInComplete() ? "Sign in succeeded" : "Sign in not complete"),
                        error -> Log.e("AuthQuickstart", error.toString())
                );

                //页面跳转
                jumpPersen();
                runOnUiThread(new Runnable() {
                    public void run() {
                        final Toast toast = Toast.makeText(getContext(), "Registration Success" ,Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
            }

            //用户问题页面跳转
            private void jumpPersen() {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Activity_perquestion.class);
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
        public void onTick(long time) {
            //防止计时过程中重复点击
            send.setClickable(false);
            send.setText(time/1000+"s");

        }

        //计时完毕的方法
        @Override
        public void onFinish() {
            //重新给Button设置文字
            send.setText("Reacquire");
            flag = false;
            //设置可点击
            send.setClickable(true);
        }
    }

}
