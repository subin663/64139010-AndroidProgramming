package vn.letanvinh.a64139010_thigiuaky;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Item3Activity_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_function_activity3_detail);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvDescription = findViewById(R.id.tvDescription);

        // Nhận dữ liệu từ Intent
        Monhoc selectedLanguage = (Monhoc) getIntent().getSerializableExtra("selectedMonhoc");

        if (selectedLanguage != null) {
            tvName.setText(selectedLanguage.getName());
            tvDescription.setText(selectedLanguage.getDescription());
        }
    }
}