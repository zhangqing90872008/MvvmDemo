package com.example.myapplication;


import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class UserViewModel {

    //注意，这里都需要定义成public，否则这个字段读取不到

    public User user;

    public ActivityMainBinding mainBinding;

    public Activity activity;


    public UserViewModel(Activity pActivity, ActivityMainBinding pMainBinding) {
        this.activity = pActivity;
        this.mainBinding = pMainBinding;
        mainBinding.setModel(this);
        init();
    }

    private void init() {
        user=new User("qingtian","10");
    }

    public void onItemClick(View pView) {

        Toast.makeText(pView.getContext(),  user.getName(), Toast.LENGTH_SHORT).show();
    }
}

