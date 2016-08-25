package com.example.sam.myapplication.adapter.binder;

public interface ItemBinder<T>
{
      int getLayoutRes(T model);
      int getBindingVariable(T model);
}
