package com.happytrees.recyclerviewinfragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] mDataset;

    //constructor
    public MyAdapter(String[] mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    //INNER CLASS
    public static class MyViewHolder extends RecyclerView.ViewHolder {


            public TextView mTextView;
            public MyViewHolder(View v) {
                super(v);

                mTextView = (TextView) v.findViewById(R.id.tv_text);
            }
        }
    }
