package com.example.examgiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;

public class Cau2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Khai báo autocomplete tv
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTV);

        // Khai báo Arraylist
        ArrayList<String> dsTenNgonNguLapTrinh=new ArrayList<String>(); //Tạo thể hiện cụ thể
        dsTenNgonNguLapTrinh.add("Python");
        dsTenNgonNguLapTrinh.add("Java");
        dsTenNgonNguLapTrinh.add("C++");
        dsTenNgonNguLapTrinh.add("C#");
        dsTenNgonNguLapTrinh.add("JavaScript");
        dsTenNgonNguLapTrinh.add("Ruby");
        //Auto complete tv
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_dropdown_item_1line, dsTenNgonNguLapTrinh
        );
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        //Auto complete tv


        ArrayAdapter<String> adapterNNLT;
        adapterNNLT=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dsTenNgonNguLapTrinh);
        ListView lvNNLT=findViewById(R.id.lvNNLT);
        lvNNLT.setAdapter(adapterNNLT);
        // **Xử lý sự kiện click vào item trong ListView**
        lvNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = dsTenNgonNguLapTrinh.get(position);

                // Chuyển sang Activity mới
                Intent intent = new Intent(Cau2Activity.this, Detail_Activity2.class);
                intent.putExtra("selectedItem", selectedItem); // Truyền dữ liệu
                startActivity(intent);
            }
        });

    }
}