package com.example.figmatest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CountActivity extends AppCompatActivity {
    ImageView iv1;
    ImageView iv4;
    ImageView iv2;
    ImageView iv6;
    TextView tvAns;
    void TimDieuKhien(){
        iv1=findViewById(R.id.btn1);
        iv4=findViewById(R.id.btn4);
        iv2=findViewById(R.id.btn2);
        iv6=findViewById(R.id.btn6);
        tvAns=findViewById(R.id.tvAnswer);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_count);
        TimDieuKhien();
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvAns.setText("Chính xác.");
            }
        });
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvAns.setText("Chưa chính xác.");
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvAns.setText("Chưa chính xác.");
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvAns.setText("Chưa chính xác.");
            }
        });
    }
}