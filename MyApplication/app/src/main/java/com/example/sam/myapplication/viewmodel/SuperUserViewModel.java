package com.example.sam.myapplication.viewmodel;


import com.example.sam.myapplication.model.User;

public class SuperUserViewModel extends UserViewModel
{
    public SuperUserViewModel(User model)
    {
        super(model);
    }

    public String getGroup()
    {
        return "Droid";
    }
}
