package com.example.mason.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.generated.model.Perception;
import com.amplifyframework.datastore.generated.model.User;
import com.example.mason.MainActivity;
import com.example.mason.R;
import com.example.mason.perquestron.Activity_perquestion;
import com.example.mason.queslist.Ques1Activity;

import static com.amazonaws.mobile.auth.core.internal.util.ThreadUtils.runOnUiThread;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Button next;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
        next = root.findViewById(R.id.ques_next1);

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

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), Ques1Activity.class);
                        startActivity(intent);

                    }
                });
//
            }
        });
        return root;
    }
}