package com.example.figmatest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ModelActivity extends AppCompatActivity {
    ImageView ivCount;
    ImageView ivMatch;
    ImageView ivPattern;
    ImageView ivSettings;
    void TimDieuKhien(){
        ivCount=findViewById(R.id.btnCou);
        ivMatch=findViewById(R.id.btnMat);
        ivPattern=findViewById(R.id.btnPat);
        ivSettings=findViewById(R.id.btnSet);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_model);
        TimDieuKhien();
        ivCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCount=new Intent(ModelActivity.this, CountActivity.class);
                startActivity(iCount);
            }
        });
        ivMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMatch=new Intent(ModelActivity.this, MatchActivity.class);
                startActivity(iMatch);
            }
        });
    }
}