package com.example.ex6_intentdongian;

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
    Button btnScreen2;
    Button btnScreen3;
    void TimDieuKhien(){
        btnScreen2=findViewById(R.id.btnMh2);
        btnScreen3=findViewById(R.id.btnMh3);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        //
        btnScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tạo 1 intent 2 tham số 1. Màn hình hiện tại 2. Màn hình muốn chuyển đến
                Intent intentMh2=new Intent(MainActivity.this, Mh2Activity.class);
                //gửi
                startActivity(intentMh2);
            }
        });

        //
        btnScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMh3=new Intent(MainActivity.this,Mh3Activity.class);
                startActivity(intentMh3);
            }
        });
    }
}