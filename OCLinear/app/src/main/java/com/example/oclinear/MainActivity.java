package com.example.oclinear;

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

    EditText edtA;
    EditText edtB;
    EditText edtKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien(){
        edtA=findViewById(R.id.edt1);
        edtB=findViewById(R.id.edt2);
        edtKQ=findViewById(R.id.edtKetQua);
        nutCong=(Button)findViewById(R.id.btnCong);
        nutTru=(Button) findViewById(R.id.btnTru);
        nutNhan=(Button)findViewById(R.id.btnNhan);
        nutChia=(Button) findViewById(R.id.btnChia);
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
        //Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
            nutCong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Xử lý cộng ở đây
                    XuLyCong();
                }
            });
            nutTru.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Xử lý trừ ở đây
                    XuLyTru();
                }
            });
            nutNhan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Xử lý nhân ở đây
                    XuLyNhan();
                }
            });
            nutChia.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Xử lý chia ở đây
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