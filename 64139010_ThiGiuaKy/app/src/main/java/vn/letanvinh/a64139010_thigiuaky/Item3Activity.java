package vn.letanvinh.a64139010_thigiuaky;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Item3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_function3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Khai báo ArrayList<Language>
        ArrayList<Monhoc> dsMonhoc = new ArrayList<>();
        dsMonhoc.add(new Monhoc("Lập trình C", "Một ngôn ngữ lập trình đa năng, dễ học. Được nhiều bạn newbie theo học hỏi và tìm hiểu."));
        dsMonhoc.add(new Monhoc("Lập trình Java ", "Một ngôn ngữ lập trình hướng đối tượng mạnh mẽ.  Được nhiều bạn đã học các ngôn ngữ cơ bản theo học hỏi và tìm hiểu."));
        dsMonhoc.add(new Monhoc("Phát triển ứng dụng Web", "Một ngôn ngữ lập trình hiệu năng cao."));
        dsMonhoc.add(new Monhoc("Khai phá dữ liệu lớn", "Ngôn ngữ lập trình đa năng được phát triển bởi Microsoft."));
        dsMonhoc.add(new Monhoc("Internet vạn vật kết nối", "Ngôn ngữ lập trình kịch bản cho web."));
        dsMonhoc.add(new Monhoc("Ruby", "Ngôn ngữ lập trình động, hướng đối tượng."));
        dsMonhoc.add(new Monhoc("...", "Không có gì."));

        // ListView
        ArrayAdapter<String> adapterNNLT = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getSubjectName(dsMonhoc));
        ListView lvNNLT = findViewById(R.id.lvMonhoc);
        lvNNLT.setAdapter(adapterNNLT);

        // Xử lý sự kiện click vào item trong ListView
        lvNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Monhoc selectedMonhoc = dsMonhoc.get(position);
                Intent intent = new Intent(Item3Activity.this, Item3Activity_Detail.class);
                intent.putExtra("selectedMonhoc", selectedMonhoc);
                startActivity(intent);
            }
        });
    }
    private ArrayList<String> getSubjectName(ArrayList<Monhoc> monhocs) {
        ArrayList<String> names = new ArrayList<>();
        for (Monhoc language : monhocs) {
            names.add(language.getName());
        }
        return names;
    }
}