package com.example.ex13_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_mu=LayoutInflater.from(context);
       View vItem=cai_mu.inflate(R.layout.item_land, parent,false);
       ItemLandHolder viewholderCreated=new ItemLandHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //Lấy đối tượng hiển thị
        LandScape landScapehienthi=lstData.get(position);
        //Trích thông tin
        String caption= landScapehienthi.getLandCaption();
        String tenanh=landScapehienthi.getLandImageFileName();
        //Đặt các trường thông tin của holder
        holder.tvCaption.setText(caption);
        //Đặt ảnh
        String packageName=holder.itemView.getContext().getPackageName();
        //Lấy id cho ảnh thôgn qua tên

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemLandHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption=itemView.findViewById(R.id.tvCaption);
            ivLandscape=itemView.findViewById(R.id.imageView);
        }
    }
}
