package com.example.convertunit;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    EditText edtAns;
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
        edt=findViewById(R.id.edtDola);
        edtAns=findViewById(R.id.edtAns);
    }
    public void btnConvert(View view)
    {
        String strA = edt.getText().toString();

        double Dola=Double.parseDouble(strA);
        //Tính toán
        double ans=Dola/25000;

        String strKQ=String.valueOf(ans); //strKQ=6
        edtAns.setText(strKQ);

    }

}