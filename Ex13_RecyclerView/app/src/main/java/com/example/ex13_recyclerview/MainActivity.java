package com.example.ex13_recyclerview;

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
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView rycyclerViewLanscape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas=getDataForRecyclerView();
        //4 Tìm điều khiển
        rycyclerViewLanscape=findViewById(R.id.recyclerLand);
        //5
        RecyclerView.LayoutManager layoutLinear=new LinearLayoutManager(this);
        rycyclerViewLanscape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter=new LandScapeAdapter(this,recyclerViewDatas);
        //7
        rycyclerViewLanscape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu=new ArrayList<LandScape>();
        LandScape landScape1=new LandScape("img","StreetImage");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("img_1","MoutainImage"));
        dsDuLieu.add(new LandScape("img_2","LakeImage"));
        dsDuLieu.add(new LandScape("img_3","SpringImage"));
        return dsDuLieu;

    }
}