package com.example.mason.ui.home;

import android.content.Intent;
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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.generated.model.Perception;
import com.example.mason.FinishActivity;
import com.example.mason.LoginActivity;
import com.example.mason.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private Button homeSubmit;

    private String name;
    private String pro1;
    private String pro2;
    private String pro3;
    private String pro4;
    private String pro5;
    private String pro6;
    private String pro7;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
        homeSubmit = root.findViewById(R.id.home_submit);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);



                homeSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Amplify.DataStore.save(
//                                ques,
//                                result -> Log.i("MyAmplifyApp", "Created a new post successfully"),
//                                error -> Log.e("MyAmplifyApp",  "Error creating post", error)
//                        );
                        Intent intent = new Intent(getActivity(), FinishActivity.class);
                        startActivity(intent);
                    }
                });

            }
        });
        return root;
    }
}