package com.example.oclinear;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view)
    {
        EditText edtA = findViewById(R.id.edt1);
        EditText edtB = findViewById(R.id.edt2);
        EditText edtKQ = findViewById(R.id.edtKetQua);
        //Lấy dữ liệu ở điều khiển A
        String strA = edtA.getText().toString(); //strA=2;
        //Lấy dữ liệu ở điều khiển B
        String strB = edtB.getText().toString(); //strB=4;

        //Chuyển dữ liệu sang dạng số
        int so_A= Integer.parseInt(strA);   //2
        int so_B= Integer.parseInt(strB);   //4
        //Tính toán
        int ans=so_A+so_B;

        //Chuyển ans sang dạng string để xuất dữ liệu
        String strKQ=String.valueOf(ans); //strKQ=6
        //Xuất dữ liệu ra màn hình
        edtKQ.setText(strKQ);

    }
}