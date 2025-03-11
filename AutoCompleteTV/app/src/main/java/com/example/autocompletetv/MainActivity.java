package com.example.autocompletetv;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        // Khai báo AutoCompleteTextView
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        // Dữ liệu gợi ý
        String[] languages = {"Python", "Java", "C++", "C#", "JavaScript", "Ruby", "Swift", "Go"};

        // Adapter kết nối dữ liệu với AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_dropdown_item_1line, languages
        );

        // Gán Adapter cho AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter);

        // Thiết lập số ký tự tối thiểu trước khi gợi ý xuất hiện
        autoCompleteTextView.setThreshold(1); // Gợi ý khi nhập từ 1 ký tự
    }
}