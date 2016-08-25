package com.example.sam.myapplication.binder;


import com.example.sam.myapplication.adapter.binder.ConditionalDataBinder;
import com.example.sam.myapplication.viewmodel.SuperUserViewModel;
import com.example.sam.myapplication.viewmodel.UserViewModel;

public class SuperUserBinder extends ConditionalDataBinder<UserViewModel>
{
    public SuperUserBinder(int bindingVariable, int layoutId)
    {
        super(bindingVariable, layoutId);
    }

    @Override
    public boolean canHandle(UserViewModel model)
    {
        return model instanceof SuperUserViewModel;
    }
}
