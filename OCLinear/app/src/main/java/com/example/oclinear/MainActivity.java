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

    EditText edtA;
    EditText edtB;
    EditText edtKQ;
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
        TimDieuKhien();
    }
    public void TimDieuKhien(){
        edtA=findViewById(R.id.edt1);
        edtB=findViewById(R.id.edt2);
        edtKQ=findViewById(R.id.edtKetQua);
    }
    public void XuLyCong(View view)
    {
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

    public void XuLyNhan(View view){
        //Lấy dữ liệu ở điều khiển A
        String str1=edtA.getText().toString();
        String str2=edtB.getText().toString();
        //
        int so_a=Integer.parseInt(str1);
        int so_b=Integer.parseInt(str2);
        int kq=so_a*so_b;
        //
        String strKq=String.valueOf(kq);
        //Xuất dữ liệu ra màn hình
        edtKQ.setText(strKq);
    }
    public void XuLyChia(View view){
        String str1=edtA.getText().toString();
        String str2=edtB.getText().toString();
        //
        int so_a=Integer.parseInt(str1);
        int so_b=Integer.parseInt(str2);
        double kq=(double)so_a/so_b;
        //
        String strKq=String.valueOf(kq);
        //Xuất dữ liệu ra màn hình
        edtKQ.setText(strKq);
    }
    public void XuLyTru(View view){
        //Lấy dữ liệu ở điều khiển A
        String str1=edtA.getText().toString();
        String str2=edtB.getText().toString();
        //
        int so_a=Integer.parseInt(str1);
        int so_b=Integer.parseInt(str2);
        int kq=so_a-so_b;
        //
        String strKq=String.valueOf(kq);
        //Xuất dữ liệu ra màn hình
        edtKQ.setText(strKq);
    }
}