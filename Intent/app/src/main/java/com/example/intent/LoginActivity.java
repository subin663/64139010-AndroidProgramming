package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    EditText edtTenDangNhap;
    Button nutXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EdgeToEdge.enable(this);
        edtTenDangNhap=findViewById(R.id.edtUsn);
        nutXacNhan=findViewById(R.id.btnOk);

        nutXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    String strtenDangNhap = edtTenDangNhap.getText().toString();
                    // gói
                    iQuiz.putExtra("tenDN",strtenDangNhap);
                    // gửi
                    startActivity(iQuiz);
            }
        });

    }
}