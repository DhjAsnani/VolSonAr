package com.example.gohan.volsonar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Freeware Sys on 29-Jun-16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
