package com.example.examgiuaki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau1Activity extends AppCompatActivity {
    EditText sa;
    EditText sb;
    EditText kq;
    Button btnkq;
    void TimDieuKhien(){
        sa=findViewById(R.id.edtsoa);
        sb=findViewById(R.id.edtsob);
        kq=findViewById(R.id.edtans);
        btnkq=findViewById(R.id.btnkq);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strA=sa.getText().toString();
                String strB=sb.getText().toString();

                double soA=Double.parseDouble(strA);
                double soB=Double.parseDouble(strB);

                double ans=soA+soB;

                String strKq=kq.getText().toString();
                strKq=String.valueOf(ans);
                //Xuất ra màn hình
                kq.setText(strKq);
            }
        });
    }
}