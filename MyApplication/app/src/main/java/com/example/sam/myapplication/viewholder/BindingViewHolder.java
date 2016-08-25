package com.example.sam.myapplication.viewholder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by sam on 2016/8/5.
 */
public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    protected final T mBinding;

    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public T getBinding() {
        return mBinding;
    }
}
