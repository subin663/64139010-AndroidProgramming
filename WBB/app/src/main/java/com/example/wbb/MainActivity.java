package com.example.wbb;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    WBBAdapter wbbAdapter;
    ArrayList<WBB> recyclerViewDatas;
    RecyclerView rycyclerViewWBB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
        WBB landScape1=new WBB("img","BrownBear","asdasd");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new WBB("img_1","ZukaBear","asdasd"));
        dsDuLieu.add(new WBB("img_2","WhiteBear","lasdasd"));
        dsDuLieu.add(new WBB("img_3","ZukaBearChild","asdasdas"));
        dsDuLieu.add(new WBB("img_4","WhiteBear2","asdasdas"));
        dsDuLieu.add(new WBB("img_5","BrownBear2","asdasdas"));
        dsDuLieu.add(new WBB("img_1","ZukaBear","asdasdas"));
        dsDuLieu.add(new WBB("img_3","ZukaBearChild","asdasdas"));
        return dsDuLieu;

    }
}