package com.gradwyn.mason.ui.dashboard;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.core.Amplify;

import com.gradwyn.mason.LoginActivity;
import com.gradwyn.mason.R;


public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private Button logout;
    private Button userContext;
    private ProgressDialog loadingDialog;
//    private FloatingActionButton exit;
    private TextView userName;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        logout = root.findViewById(R.id.user_exit);
        userContext = root.findViewById(R.id.user_context);
        userName = root.findViewById(R.id.user_name);
        userName.setText(Amplify.Auth.getCurrentUser().getUsername());

        userContext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri content_url = Uri.parse( "https://www.termsfeed.com/live/aadc85b9-ea4a-4d85-98f5-12516a85fb53" );
                Intent intent = new Intent(Intent.ACTION_VIEW,content_url);
                startActivity(intent);
            }
        });

        // 退出登录事件
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建登陆加载动画
                loadingDialog = new ProgressDialog(getContext());
                // 点击空白不消失
                loadingDialog.setCancelable(false);
                loadingDialog.show();
                loadingDialog.setContentView(R.layout.loading_view);
                Amplify.Auth.signOut(
                        AuthSignOutOptions.builder().globalSignOut(true).build(),
                        this::onSignOutSuccess,
                        this::onSiginOutError
                );
            }

            // 退出登录失败
            private void onSiginOutError(AuthException e) {
                loadingDialog.dismiss();
                Log.e("AuthQuickstart", e.toString());
            }

            // 退出登录成功
            private void onSignOutSuccess() {
                loadingDialog.dismiss();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                Log.i("AuthQuickstart", "Signed out globally");
            }
        });

        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}