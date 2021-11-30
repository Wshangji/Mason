package com.gradwyn.mason.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUtil {

    //判断是否是邮箱
    public static boolean isEmail(String email) {
        String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)"
                + "|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);

        return m.matches();
    }

    //判断密码是否满足要求
    public static boolean passwordVerify(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            return true;
        }
    }
}
