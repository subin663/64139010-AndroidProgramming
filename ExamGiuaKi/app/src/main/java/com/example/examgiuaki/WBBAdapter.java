package com.example.examgiuaki;

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
    Context context;
    ArrayList<WBB> lstData;

    public WBBAdapter(Context context, ArrayList<WBB> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public itemBearHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater link_fb=LayoutInflater.from(context);
        View vItem1=link_fb.inflate(R.layout.wbb, parent,false);
        itemBearHolder viewholderCreated=new itemBearHolder(vItem1);

        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull itemBearHolder holder, int position) {
        //Lấy đối tượng hiển thị
        WBB wbbHienthi=lstData.get(position);
        //Trích thông tin
        String ctFb= wbbHienthi.getWbbFb();
        String ctIns=wbbHienthi.getWbbIns();
        String tenanh=wbbHienthi.getWbbFileName();
        //Đặt các trường thông tin của holder
        holder.tvFacebook.setText(ctFb);
        holder.tvInstagram.setText(ctIns);
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
        TextView tvInstagram;
        ImageView ivBearAvt;

        public itemBearHolder(@NonNull View itemView) {
            super(itemView);
            tvFacebook=itemView.findViewById(R.id.tvFb);
            tvInstagram=itemView.findViewById(R.id.tvIns);
            ivBearAvt=itemView.findViewById(R.id.ivBear);
        }
    }
}
