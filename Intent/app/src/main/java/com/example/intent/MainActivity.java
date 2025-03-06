package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nutDangNhap=findViewById(R.id.btnLogin);
        nutDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code ở đây
                //1. Tạo mới Intent (Ngữ cảnh hiện sử dụng, màn hình chuyênr ến (nhận)
                Intent iLogin= new Intent(MainActivity.this, LoginActivity.class );
                //1.1 Cú pháp gói dữ lệu
                //iLogin.pitExtra(key, value);
                //2. Gọi ệnh chuỷen
                startActivity(iLogin);
            }
        });
    }

}