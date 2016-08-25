package com.example.sam.myapplication.binder;


import com.example.sam.myapplication.adapter.binder.ConditionalDataBinder;
import com.example.sam.myapplication.viewmodel.UserViewModel;

public class UserBinder extends ConditionalDataBinder<UserViewModel>
{
    public UserBinder(int bindingVariable, int layoutId)
    {
        super(bindingVariable, layoutId);
    }

    @Override
    public boolean canHandle(UserViewModel model)
    {
        return true;
    }
}
