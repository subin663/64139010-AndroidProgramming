package com.example.example;

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
    //Khai báo các đối tượng tương ứng với các điều khiển (view) cần thao tác
    EditText edtA;
    EditText edtB;
    EditText edtKQ;
    Button nutCong;
    Button nutTru;
    Button nutNhan;
    Button nutChia;
    void TimDieuKhien(){
        edtA=findViewById(R.id.edt1);
        edtB=findViewById(R.id.edt2);
        edtKQ=findViewById(R.id.edtKetQua);
        nutCong=findViewById(R.id.btnCong);
        nutTru= findViewById(R.id.btnTru);
        nutNhan= findViewById(R.id.btnNhan);
        nutChia= findViewById(R.id.btnChia);
    }
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
        //Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút một
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong();
            }
        });
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }
        });
    }
    void XuLyCong()
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
    void XuLyNhan(){
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
    void XuLyChia(){
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
    public void XuLyTru(){
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