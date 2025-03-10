package com.example.lvngonngulaptrinh;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewNNLT;
    ArrayList<String> dsNNLT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listViewNNLT=findViewById(R.id.lvNNLT);
        // Chuẩn hị dữ liệu, hard code
        dsNNLT=new ArrayList<String>();
        dsNNLT.add("Python");
        dsNNLT.add("C");
        dsNNLT.add("C++");
        dsNNLT.add("C-");
        dsNNLT.add("Java");
        dsNNLT.add("Ruby");

        //B2.
        ArrayAdapter<String> adapterNNLT;
        adapterNNLT =new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, dsNNLT
        );

        //B3. Gắn adapter
        listViewNNLT.setAdapter(adapterNNLT);

        //B4. Gắn bộ lắng nghe và xử lý sự kiện
        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Code xử l trực tiếp ở đây
                //Chú ý: biến position  chứa vị trí của item được click
                String giaTriDuocChon= dsNNLT.get(position);
                //Làm gì đó với giá trị này thì tuỳ
                //ĐƠn giản, ta Toast lên
                Toast.makeText(MainActivity.this, giaTriDuocChon, Toast.LENGTH_SHORT).show();


            }
        });
    }
}