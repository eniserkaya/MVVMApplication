package com.eniserkaya.mvvmapplication.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

public class User {

    @NonNull
    private String eMail;
    @NonNull
    private String mPassword;

    public User(@NonNull String eMail, @NonNull String mPassword) {
        this.eMail = eMail;
        this.mPassword = mPassword;
    }

    @NonNull
    public String geteMail() {
        return eMail;
    }

    public void seteMail(@NonNull String eMail) {
        this.eMail = eMail;
    }

    @NonNull
    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(@NonNull String mPassword) {
        this.mPassword = mPassword;
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(geteMail()) && Patterns.EMAIL_ADDRESS.matcher(geteMail()).matches() && getmPassword().length() > 5;
    }
}
