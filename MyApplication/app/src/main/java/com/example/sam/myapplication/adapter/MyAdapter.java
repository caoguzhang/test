package com.example.sam.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sam.myapplication.R;
import com.example.sam.myapplication.viewholder.BindingViewHolder;

import java.util.List;

/**
 * Created by sam on 2016/8/5.
 */
public class MyAdapter extends RecyclerView.Adapter
{
    private List<String> mDatas;
    private Context mContext;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<String> datas){
        this. mContext=context;
        this. mDatas=datas;
        inflater=LayoutInflater. from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return mDatas.size();
    }

}
