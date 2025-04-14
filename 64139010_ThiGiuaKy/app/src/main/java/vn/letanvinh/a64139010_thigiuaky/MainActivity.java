package vn.letanvinh.a64139010_thigiuaky;

import android.content.Intent;
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
    Button btn2;
    Button btn3;
    Button btn4;
    Button btnAm;
    Button btnBMI;
    void TimDieuKhien(){
        btn2=findViewById(R.id.btnFt2);
        btn3=findViewById(R.id.btnFt3);
        btn4=findViewById(R.id.btnFt4);
        btnAm=findViewById(R.id.btnAboutme);
        btnBMI=findViewById(R.id.btnBMI);
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
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this, Item2Activity.class);
                startActivity(intent2);
                Toast.makeText(MainActivity.this, "Tính điểm trung bình môn học !", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this, Item3Activity.class);
                startActivity(intent3);
                Toast.makeText(MainActivity.this, "Danh sách môn học !", Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this, Item4Activity.class);
                startActivity(intent4);
                Toast.makeText(MainActivity.this, "Tin và sự kiện !", Toast.LENGTH_SHORT).show();
            }
        });
        btnAm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this, Item5Activity.class);
                startActivity(intent5);
                Toast.makeText(MainActivity.this, "Giới thiệu thông tin cá nhan !", Toast.LENGTH_SHORT).show();
            }
        });
        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this, Item6Activity.class);
                startActivity(intent5);
                Toast.makeText(MainActivity.this, "Ứng dụng đo BMI !", Toast.LENGTH_SHORT).show();
            }
        });

    }
}