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
import com.example.mason.queslist.ListActivity1;
import com.example.mason.queslist.ListActivity2;

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
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), ListActivity1.class);
                        startActivity(intent);

//                        String username = Amplify.Auth.getCurrentUser().getUsername();
//
//                        Amplify.DataStore.save(
//                                Questions.builder()
//                                .name(username)
//                                .pro1(pro1)
//                                .pro2(pro2)
//                                .pro3(pro3)
//                                .pro4(pro4)
//                                .pro5(pro5)
//                                .pro6(pro6)
//                                .pro7(pro7)
//                                .build(),
//                                this::onSaveSuccess,
//                                this::onSaveError
//                        );
                    }
//
//                    private void onSaveError(DataStoreException e) {
//                        Log.i("Question save", "Result: " + e.toString());
//                    }
//
//                    private <T extends Model> void onSaveSuccess(DataStoreItemChange<T> tDataStoreItemChange) {
//                        Intent intent = new Intent(getActivity(), FinishActivity.class);
//                        startActivity(intent);
//                    }

                });
//
            }
        });
        return root;
    }
}