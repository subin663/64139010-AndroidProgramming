package com.example.ex8_calculatorcheck;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView tvAns;
    void TimDieuKhien(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        tvAns=findViewById(R.id.tvAns);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        TimDieuKhien();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvAns.setText("Correct ✔");
            }
        });
        View.OnClickListener incorrectAnswerListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvAns.setText("Uncorrect ✘");
                Toast.makeText(HomeActivity.this, "Vui lòng chọn đáp án khác!", Toast.LENGTH_SHORT).show();
            }
        };
        Button[] buttons = {btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
        for (Button btn : buttons) {
            btn.setOnClickListener(incorrectAnswerListener);
        }
    }
}