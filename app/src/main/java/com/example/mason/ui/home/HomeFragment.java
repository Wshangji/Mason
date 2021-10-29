package com.example.mason.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.amplifyframework.datastore.generated.model.Perception;
import com.amplifyframework.datastore.generated.model.Questions;
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
        EditText pro_1 = root.findViewById(R.id.pro_1);
        SeekBar pro_2 = root.findViewById(R.id.pro_2);
        EditText pro_3 = root.findViewById(R.id.pro_3);
        EditText pro_4 = root.findViewById(R.id.pro_4);
        EditText pro_5 = root.findViewById(R.id.pro_5);
        EditText pro_6 = root.findViewById(R.id.pro_6);
        EditText pro_7 = root.findViewById(R.id.pro_7);
        homeSubmit = root.findViewById(R.id.home_submit);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
                homeSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pro1 = pro_1.getText().toString();
                        //pro2 = pro_2.getText().toString();
                        pro3 = pro_3.getText().toString();
                        pro4 = pro_4.getText().toString();
                        pro5 = pro_5.getText().toString();
                        pro6 = pro_6.getText().toString();
                        pro7 = pro_7.getText().toString();

                        String username = Amplify.Auth.getCurrentUser().getUsername();

                        Amplify.DataStore.save(
                                Questions.builder()
                                .name(username)
                                .pro1(pro1)
                                .pro2(pro2)
                                .pro3(pro3)
                                .pro4(pro4)
                                .pro5(pro5)
                                .pro6(pro6)
                                .pro7(pro7)
                                .build(),
                                this::onSaveSuccess,
                                this::onSaveError
                        );
                    }

                    private void onSaveError(DataStoreException e) {
                        Log.i("Question save", "Result: " + e.toString());
                    }

                    private <T extends Model> void onSaveSuccess(DataStoreItemChange<T> tDataStoreItemChange) {
                        Intent intent = new Intent(getActivity(), FinishActivity.class);
                        startActivity(intent);
                    }

                });

            }
        });
        return root;
    }
}