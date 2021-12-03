package com.gradwyn.mason.ui.dashboard;

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

import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.core.Amplify;

import com.gradwyn.mason.LoginActivity;
import com.gradwyn.mason.R;


public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private Button logout;
    private Button userContext;
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

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Amplify.Auth.signOut(
                        AuthSignOutOptions.builder().globalSignOut(true).build(),
                        () -> Log.i("AuthQuickstart", "Signed out globally"),
                        error -> Log.e("AuthQuickstart", error.toString())
                );
//                Amplify.DataStore.clear(
//                        () -> Log.i("MyAmplifyApp", "DataStore is cleared."),
//                        failure -> Log.e("MyAmplifyApp", "Failed to clear DataStore.")
//                );
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}