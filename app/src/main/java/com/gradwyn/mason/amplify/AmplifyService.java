package com.gradwyn.mason.amplify;

import android.content.Intent;
import android.util.Log;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.generated.model.User;
import com.gradwyn.mason.perquestron.Activity_perquestion;

public class AmplifyService {
//    public static Boolean findByUserID(User user) {
//        Boolean flag = false;
//        Amplify.DataStore.query(
//                User.class,
//                Where.id(Amplify.Auth.getCurrentUser().getUserId()),
//                matches -> {
//                    if (matches.hasNext()) {
//                        if (!matches.next().getIsAgree()){
//                            flag = true;
//                        }
//                    } else {
//                        flag = false;
//                    }
//                },
//                failure -> Amplify.DataStore.clear()
//                );
//
//        return flag;
//    }

    public static void findByUserName(User user) {

    }
}
