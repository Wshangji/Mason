 package com.gradwyn.mason.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Page;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.generated.model.Questions;
import com.amplifyframework.datastore.generated.model.User;
import com.gradwyn.mason.FinishActivity;
import com.gradwyn.mason.R;
import com.gradwyn.mason.perquestron.Activity_perquestion;
import com.gradwyn.mason.queslist.Ques1Activity;
import com.gradwyn.mason.queslist.Ques2Activity;
import com.gradwyn.mason.util.Contexts;
import com.gradwyn.mason.util.NotificationUtil;

import static com.gradwyn.mason.util.DateUtil.differentDaysByMillisecond;

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

        // 是否开启问卷
//        Amplify.DataStore.query(
//                Questions.class,
//                Where.matches(Questions.NAME.eq(Amplify.Auth.getCurrentUser().getUsername()))
//                        .sorted(Questions.UPDATED_AT.descending())
//                        .paginated(Page.startingAt(0).withLimit(1)),
//                matches -> {
//                    if (matches.hasNext()) {
//                        Questions questions = matches.next();
//                        if (questions!=null) {
//                            int n = differentDaysByMillisecond(questions.getUpdatedAt().toDate());
//                            Log.i("计算间隔", "IsQuestionnaireOpen: "+n);
//                            if (n<14) {
//                                Intent intent = new Intent();
//                                intent.setClass(getActivity(), FinishActivity.class);
//                                startActivity(intent);
//                            }
//                        }
//                        Log.i("Amplify Query Data", "questions: " + questions);
//                    }
//                },
//                failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
//        );

//        判断是否同意许可协议
//        Amplify.DataStore.query(User.class, Where.id(Amplify.Auth.getCurrentUser().getUserId()),
//                matches -> {
//                    if (matches.hasNext()) {
//                        User user = matches.next();
//                        Log.i("Amplify Query User", "User: " + user);
//                        if (!user.getIsAgree()){
//                            Intent intent = new Intent();
//                            intent.setClass(getActivity(), Activity_perquestion.class);
//                            startActivity(intent);
//                        }
//                    } else {
//                        Intent intent = new Intent();
//                        intent.setClass(getActivity(), Activity_perquestion.class);
//                        startActivity(intent);
//                    }
//                },
//                failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
//                );

        // 判断是否获取通知
        if (!NotificationUtil.isNotifyEnabled(getActivity())) {
            NotificationUtil.requestNotify(getActivity());
        }

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                next.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (Contexts.pro1 != null) {
//                            Intent intent = new Intent(getActivity(), Ques2Activity.class);
//                            startActivity(intent);
//                            getActivity().finish();
//                        } else {
//                            //弹出框
//                            AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
//                            builder1.setIcon(R.drawable.warn);
//                            builder1.setTitle("Warnings");
//                            builder1.setMessage("Please complete questions");
//                            AlertDialog alert11 = builder1.create();
//                            alert11.show();
//                        }
//                    }
//                });
            }
        });
        return root;
    }

 }