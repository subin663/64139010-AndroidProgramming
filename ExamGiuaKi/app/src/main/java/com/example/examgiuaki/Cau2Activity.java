package com.example.examgiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Cau2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTV);

        // Khai báo ArrayList<Language>
        ArrayList<Language> dsNgonNguLapTrinh = new ArrayList<>();
        dsNgonNguLapTrinh.add(new Language("Python", "Một ngôn ngữ lập trình đa năng, dễ học."));
        dsNgonNguLapTrinh.add(new Language("Java", "Một ngôn ngữ lập trình hướng đối tượng mạnh mẽ."));
        dsNgonNguLapTrinh.add(new Language("C++", "Một ngôn ngữ lập trình hiệu năng cao."));
        dsNgonNguLapTrinh.add(new Language("C#", "Ngôn ngữ lập trình đa năng được phát triển bởi Microsoft."));
        dsNgonNguLapTrinh.add(new Language("JavaScript", "Ngôn ngữ lập trình kịch bản cho web."));
        dsNgonNguLapTrinh.add(new Language("Ruby", "Ngôn ngữ lập trình động, hướng đối tượng."));

        // AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_dropdown_item_1line, getLanguageNames(dsNgonNguLapTrinh)
        );
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        // ListView
        ArrayAdapter<String> adapterNNLT = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getLanguageNames(dsNgonNguLapTrinh));
        ListView lvNNLT = findViewById(R.id.lvNNLT);
        lvNNLT.setAdapter(adapterNNLT);

        // Xử lý sự kiện click vào item trong ListView
        lvNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Language selectedLanguage = dsNgonNguLapTrinh.get(position);
                Intent intent = new Intent(Cau2Activity.this, Detail_Activity2.class);
                intent.putExtra("selectedLanguage", selectedLanguage);
                startActivity(intent);
            }
        });
    }
    // Phương thức để lấy danh sách tên ngôn ngữ từ ArrayList<Language>
    private ArrayList<String> getLanguageNames(ArrayList<Language> languages) {
        ArrayList<String> names = new ArrayList<>();
        for (Language language : languages) {
            names.add(language.getName());
        }
        return names;
    }
}