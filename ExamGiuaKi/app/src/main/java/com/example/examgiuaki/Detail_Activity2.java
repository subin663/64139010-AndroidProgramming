package com.example.examgiuaki;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Detail_Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail2);
        // Nhận dữ liệu từ Intent
        String selectedItem = getIntent().getStringExtra("selectedItem");

        // Hiển thị dữ liệu
        TextView textView = findViewById(R.id.txtDetail);
        textView.setText("Bạn đã chọn: " + selectedItem);

    }
}