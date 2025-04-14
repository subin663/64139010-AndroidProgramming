package vn.letanvinh.a64139010_thigiuaky;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Item4Activity extends AppCompatActivity {

    WBBAdapter wbbAdapter;
    ArrayList<WBB> recyclerViewDatas;
    RecyclerView rycyclerViewWBB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_function4);
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
        dsDuLieu.add(new WBB(1,"img_1","ZukaBear","1/2/2023", "ZukaBear là một chú gấu mạnh mẽ"));
        dsDuLieu.add(new WBB(2,"img_2","WhiteBear","1/2/2023", "WhiteBear đến từ vùng lạnh giá"));
        dsDuLieu.add(new WBB(3,"img_3","ZukaBearChild","1/2/2023", "ZukaBearChild là phiên bản nhỏ của ZukaBear"));
        dsDuLieu.add(new WBB(4,"img_4","WhiteBear2","1/2/2023", "WhiteBear2 có bộ lông trắng muốt"));
        dsDuLieu.add(new WBB(5,"img_5","BrownBear2","1/2/2023", "BrownBear2 là chú gấu nâu đáng yêu"));
        dsDuLieu.add(new WBB(6,"img_1","ZukaBear","1/2/2023", "ZukaBear dũng mãnh và kiên cường"));
        dsDuLieu.add(new WBB(7,"img_3","ZukaBearChild",";1/2/2023", "ZukaBearChild đang học cách trở thành chiến binh"));
        return dsDuLieu;
    }

}