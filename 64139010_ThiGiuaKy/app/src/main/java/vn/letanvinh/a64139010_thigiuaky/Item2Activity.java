package vn.letanvinh.a64139010_thigiuaky;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Item2Activity extends AppCompatActivity {
    EditText edtDiemqt;
    EditText edtDiemgk;
    EditText edtDiemck;
    Button btnDiemtb;
    TextView tvKq;
    void TimDieuKhien(){
        edtDiemqt=findViewById(R.id.edtDiemqt);
        edtDiemgk=findViewById(R.id.edtDiemgk);
        edtDiemck=findViewById(R.id.edtDiemck);
        btnDiemtb=findViewById(R.id.btnDiemtb);
        tvKq=findViewById(R.id.tvAns);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_function2);
        TimDieuKhien();
        btnDiemtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strDiemqt = edtDiemqt.getText().toString();
                String strDiemgk = edtDiemgk.getText().toString();
                String strDiemck = edtDiemck.getText().toString();

                //Chuyển dữ liệu sang dạng số
                double diem_QT= Double.parseDouble(strDiemqt);   //2
                double diem_GK= Double.parseDouble(strDiemgk);   //4
                double diem_CK= Double.parseDouble(strDiemck);
                //Tính toán
                double ans=0.2*diem_QT  + 0.3*diem_GK + 0.5*diem_CK;

                //Chuyển ans sang dạng string để xuất dữ liệu
                String strKQ=String.valueOf(ans); //strKQ=6
                //Xuất dữ liệu ra màn hình
                tvKq.setText(strKQ);
            }
        });
    }

}