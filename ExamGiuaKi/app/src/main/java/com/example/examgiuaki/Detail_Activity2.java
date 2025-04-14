package com.example.examgiuaki;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail_Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        TextView tvName = findViewById(R.id.tvName);
        TextView tvDescription = findViewById(R.id.tvDescription);

        // Nhận dữ liệu từ Intent
        Language selectedLanguage = (Language) getIntent().getSerializableExtra("selectedLanguage");

        if (selectedLanguage != null) {
            tvName.setText(selectedLanguage.getName());
            tvDescription.setText(selectedLanguage.getDescription());
        }
    }
}