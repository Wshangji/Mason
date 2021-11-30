 package com.gradwyn.mason.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.generated.model.User;
import com.gradwyn.mason.R;
import com.gradwyn.mason.perquestron.Activity_perquestion;
import com.gradwyn.mason.queslist.Ques2Activity;
import com.gradwyn.mason.util.Contexts;
import com.gradwyn.mason.util.NotificationUtil;

 public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
     private Button next;
     private TextView textView;
     private SeekBar seekBar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        next = root.findViewById(R.id.ques_next1);
        textView = root.findViewById(R.id.seek_view);
        seekBar = root.findViewById(R.id.ques1_seekbar);

        // 滑动条数字提示
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Contexts.pro1 = String.valueOf(progress);
                textView.setText(Contexts.pro1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //判断是否同意许可协议
        Amplify.DataStore.query(User.class, Where.id(Amplify.Auth.getCurrentUser().getUserId()),
                matches -> {
                    if (matches.hasNext()) {
                        if (!matches.next().getIsAgree()){
                            Intent intent = new Intent();
                            intent.setClass(getActivity(), Activity_perquestion.class);
                            startActivity(intent);
                        }
                    } else {
                        Intent intent = new Intent();
                        intent.setClass(getActivity(), Activity_perquestion.class);
                        startActivity(intent);
                    }
                },
                failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
                );

        if (!NotificationUtil.isNotifyEnabled(getActivity())) {
//            Intent localIntent = new Intent();
//            //直接跳转到应用通知设置的代码：
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {//8.0及以上
//                localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
//                localIntent.setData(Uri.fromParts("package", getPackageName(), null));
//            } else if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//5.0以上到8.0以下
//                localIntent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
//                localIntent.putExtra("app_package", getPackageName());
//                localIntent.putExtra("app_uid", getApplicationInfo().uid);
//            } else if (android.os.Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {//4.4
//                localIntent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
//                localIntent.addCategory(Intent.CATEGORY_DEFAULT);
//                localIntent.setData(Uri.parse("package:" + getPackageName()));
//            } else {
//                //4.4以下没有从app跳转到应用通知设置页面的Action，可考虑跳转到应用详情页面,
//                localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                if (Build.VERSION.SDK_INT >= 9) {
//                    localIntent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
//                    localIntent.setData(Uri.fromParts("package", getPackageName(), null));
//                } else if (Build.VERSION.SDK_INT <= 8) {
//                    localIntent.setAction(Intent.ACTION_VIEW);
//                    localIntent.setClassName("com.android.settings", "com.android.setting.InstalledAppDetails");
//                    localIntent.putExtra("com.android.settings.ApplicationPkgName", getPackageName());
//                }
//            }
//            startActivity(localIntent);

        }

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), Ques2Activity.class);
                        startActivity(intent);
                        getActivity().finish();
                    }
                });
            }
        });
        return root;
    }
}