package com.example.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    EditText edtUN;
    EditText edtPW;
    Button btnXN;
    void TimDieuKhien(){
        edtPW=findViewById(R.id.edtPassword);
        edtUN=findViewById(R.id.edtUserName);
        btnXN=findViewById(R.id.btnXacnhan);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        TimDieuKhien();
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username=edtUN.getText().toString();
                String Password=edtPW.getText().toString();
                if (Username.equals("letanvinh") &&Password.equals("vinh123")){
                    Intent iQuiz=new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(iQuiz);
                    //Gói dữ liệu vào iquiz, dạng key- value, key được dùng để bên kia lọc ra dữ liệu
                    iQuiz.putExtra("ten_dang_nhap", Username);
                    iQuiz.putExtra("mat_khau", Password);

                    Toast.makeText(LoginActivity.this,"Xin Chào",Toast.LENGTH_LONG).show();
                    startActivity(iQuiz);
                }else{
                    Toast.makeText(LoginActivity.this,"VUI LÒNG KIỂM TRA LẠI USERNAME HOẶC PASSWORD",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}