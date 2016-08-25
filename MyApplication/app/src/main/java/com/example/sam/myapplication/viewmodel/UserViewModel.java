package com.example.sam.myapplication.viewmodel;

import android.databinding.BaseObservable;
import com.example.sam.myapplication.model.User;

public class UserViewModel extends BaseObservable
{
    private final User model;

    public UserViewModel(User model)
    {
        this.model = model;
    }

    public User getModel()
    {
        return model;
    }

    public String getFirstName()
    {
        return model.getFirstName();
    }

    public String getLastName()
    {
        return model.getLastName();
    }
}
