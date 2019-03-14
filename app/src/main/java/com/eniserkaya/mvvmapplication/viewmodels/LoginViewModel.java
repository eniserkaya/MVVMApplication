package com.eniserkaya.mvvmapplication.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;
import android.util.Patterns;

import com.eniserkaya.mvvmapplication.BR;
import com.eniserkaya.mvvmapplication.model.User;

public class LoginViewModel extends BaseObservable {
    private User user;

    private String successMessage = "Login was successful";
    private String errorMessage = "Email or password not valid";

    @Bindable
    private String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }


    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }


    public void setUserEmail(String email) {
        user.seteMail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    @Bindable
    public String getUserEmail() {
        return user.geteMail();
    }

    @Bindable
    public String getUserPassword() {
        return user.getmPassword();
    }

    public void setUserPassword(String password) {
        user.setmPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

    public LoginViewModel() {
        user = new User("","");
    }

    public void onLoginClicked() {
        if (user.isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }
}