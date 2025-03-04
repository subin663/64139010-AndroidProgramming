package com.example.listener;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnSayHello;
    @SuppressLint("MissingInflatedId")
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
        //B3: gắn bộ lắng nghe cho Nút bấm
        btnSayHello = findViewById(R.id.btnSayHi);
        btnSayHello.setOnClickListener(bo_lang_nghe_Xl_XinChao);

    }

    //2.1 Listener in Varibale
    View.OnClickListener bo_lang_nghe_Xl_XinChao= new View.OnClickListener(){
        @Override
        public void onClick(View v){
            //Code ử lý ở đây
            //Ví dụ, hiện thông báo nhanh bằng ớp Toast
          //  Toast.makeText(ngữ_cảnh, nội_dung_Tbáo, thời_gian_hiện).show();
            Toast.makeText(MainActivity.this,
                            "Chào all HTTT+",
                            Toast.LENGTH_LONG).show();
        }
    };
}