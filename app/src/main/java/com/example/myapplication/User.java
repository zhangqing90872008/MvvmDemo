package com.example.myapplication;

import android.view.View;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;


public class User extends BaseObservable {

    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<String> age = new ObservableField<>();


    public User(String pName, String pAge) {
        name.set(pName);
        age.set(pAge);
    }

    @Bindable
    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
        notifyPropertyChanged(com.example.myapplication.BR.name);
    }

    @Bindable
    public String getAge() {
        return age.get();
    }

    public void setAge(String age) {
        this.age.set(age);
        notifyPropertyChanged(com.example.myapplication.BR.age);
    }

    public void onItemClick(View pView) {
        Toast.makeText(pView.getContext(), name.get(), Toast.LENGTH_SHORT).show();
        setName("June");
        setAge("10");
    }

}

