package com.example.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        //Lấy intent về
        Intent intentFromLogin=getIntent();
        //Lọc lấy dữ liệu chuỗi
        String ten_dn_get=intentFromLogin.getStringExtra("ten_dang_nhap");
        TextView tvTenDN=findViewById(R.id.idTenDN);
        tvTenDN.setText(ten_dn_get);
    }
}