package com.example.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Timdieukhien();
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //note
    public void Timdieukhien()
    {
        EditText edtextA = findViewById(R.id.edtA);
        EditText edtextB = findViewById(R.id.edtB);
        EditText editKQ = findViewById(R.id.edtKQ);
        String strA = edtextB.getText().toString(); //strA=2;
        String strB = edtextB.getText().toString(); //strB=4;
    }
    
    public void Xu_Ly_Cong(View v){
        
    }
    
    public void Xu_Ly_Tru(View v){
        
    }
    
    
}