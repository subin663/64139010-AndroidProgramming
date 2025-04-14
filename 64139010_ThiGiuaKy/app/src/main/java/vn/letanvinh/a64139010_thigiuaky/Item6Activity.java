package vn.letanvinh.a64139010_thigiuaky;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Item6Activity extends AppCompatActivity {
    Button btnKq;
    void TimDieuKhien(){
        btnKq=findViewById(R.id.btnKq);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        btnKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtChieucao= findViewById(R.id.edtCm);
                EditText edtCannang= findViewById(R.id.edtKg);
                EditText edtKetqua= findViewById(R.id.edtKQ);
                EditText edtRate= findViewById(R.id.edtRate);

                //Lấy dữ liệu ở từng điều khiển
                String strChieucao=edtChieucao.getText().toString();
                String strCannang=edtCannang.getText().toString();
                String strKetqua=edtKetqua.getText().toString();
                String strRate=edtRate.getText().toString();

                // Lấy RadioGroup và kiểm tra lựa chọn
                RadioGroup radioGroupGender = findViewById(R.id.rdoSex);
                int selectedId = radioGroupGender.getCheckedRadioButtonId(); // Lấy ID của RadioButton được chọn

                String gender = "";
                if (selectedId == R.id.rdoNam) {
                    gender = "Nam";
                } else if (selectedId == R.id.rdoNu) {
                    gender = "Nữ";
                }

                //Chuyển từ string sang số
                double chieucao=Double.parseDouble(strChieucao);
                double cannang=Double.parseDouble(strCannang);
                double ketqua=0;
                if (selectedId == R.id.rdoNam){
                    ketqua=cannang/(chieucao*chieucao);
                    if (ketqua<18.5){
                        strRate="Nhẹ cân";
                    }else if(ketqua>=18.5 && ketqua<=24.9){
                        strRate="Bình thường";
                    }else if(ketqua>=25){
                        strRate="Thừa cân";
                    }else{
                        strRate="Béo phì";
                    }
                }

                if (selectedId == R.id.rdoNu){
                    ketqua=cannang/(chieucao*chieucao);
                    if (ketqua<18.5){
                        strRate="Nhẹ cân";
                    }else if(ketqua>=18.5 && ketqua<=22.9){
                        strRate="Bình thường";
                    }else if(ketqua>=23){
                        strRate="Thừa cân";
                    }else{
                        strRate="Béo phì";
                    }
                }
                String Ketqua = String.format("%.1f", ketqua);
                edtKetqua.setText(Ketqua);
                edtRate.setText(strRate);
            }
        });
    }
}