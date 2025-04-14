package com.example.wbb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WBBAdapter extends RecyclerView.Adapter<WBBAdapter.itemBearHolder> {
    Context contextfb;
    //Context contextins;
    ArrayList<WBB> lstData;

    public WBBAdapter(Context contextfb, ArrayList<WBB> lstData) {
        this.contextfb = contextfb;
        //this.contextins = contextins;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public itemBearHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater link_fb=LayoutInflater.from(contextfb);
        //LayoutInflater link_ins=LayoutInflater.from(contextins);
        View vItem1=link_fb.inflate(R.layout.wbb, parent,false);
        //View vItem2=link_ins.inflate(R.layout.wbb,parent,false);
        itemBearHolder viewholderCreated=new itemBearHolder(vItem1);
        //itemBearHolder viewholderCreated2=new itemBearHolder(vItem2);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull itemBearHolder holder, int position) {
        //Lấy đối tượng hiển thị
        WBB wbbHienthi=lstData.get(position);
        //Trích thông tin
        String caption= wbbHienthi.getWbbFb();
        String tenanh=wbbHienthi.getWbbFileName();
        //Đặt các trường thông tin của holder
        holder.tvFacebook.setText(caption);
        //Đặt ảnh
        String packageName=holder.itemView.getContext().getPackageName();
        int imageID=holder.itemView.getResources().getIdentifier(tenanh,"mipmap", packageName);
        holder.ivBearAvt.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class itemBearHolder extends RecyclerView.ViewHolder{
        TextView tvFacebook;
        ImageView ivBearAvt;

        public itemBearHolder(@NonNull View itemView) {
            super(itemView);
            tvFacebook=itemView.findViewById(R.id.tvFb);
            ivBearAvt=itemView.findViewById(R.id.ivBear);
        }
    }
}
