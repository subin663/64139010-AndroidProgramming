package com.example.examgiuaki;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cau3Activity extends AppCompatActivity {
    WBBAdapter wbbAdapter;
    ArrayList<WBB> recyclerViewDatas;
    RecyclerView rycyclerViewWBB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau3);
        //3
        recyclerViewDatas=getDataForRecyclerView();
        //4 Tìm điều khiển
        rycyclerViewWBB=findViewById(R.id.recyclerView);
        //5
        RecyclerView.LayoutManager layoutLinear=new LinearLayoutManager(this);
        rycyclerViewWBB.setLayoutManager(layoutLinear);
        //6
        wbbAdapter=new WBBAdapter(this,recyclerViewDatas);
        //7
        rycyclerViewWBB.setAdapter(wbbAdapter);

    }

    ArrayList<WBB> getDataForRecyclerView(){
        ArrayList<WBB> dsDuLieu=new ArrayList<WBB>();
        dsDuLieu.add(new WBB(1,"img_1","ZukaBear","khbjk"));
        dsDuLieu.add(new WBB(2,"img_2","WhiteBear","hjjkhj"));
        dsDuLieu.add(new WBB(3,"img_3","ZukaBearChild","lkl"));
        dsDuLieu.add(new WBB(4,"img_4","WhiteBear2","lkjn"));
        dsDuLieu.add(new WBB(5,"img_5","BrownBear2","ljhj"));
        dsDuLieu.add(new WBB(6,"img_1","ZukaBear","knl"));
        dsDuLieu.add(new WBB(7,"img_3","ZukaBearChild",";kjlkj"));
        return dsDuLieu;
    }

}