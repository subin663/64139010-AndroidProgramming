package com.example.figmatest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView ivIndo;
    ImageView ivEnglish;
    ImageView ivChinese;
    ImageView ivJapanese;
    void TimDieuKhien(){
        ivEnglish=findViewById(R.id.btnEn);
        ivIndo=findViewById(R.id.btnIn);
        ivChinese=findViewById(R.id.btnCn);
        ivJapanese=findViewById(R.id.btnJp);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ivEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iModel=new Intent(MainActivity.this, ModelActivity.class);
                startActivity(iModel);
            }
        });
    }
}