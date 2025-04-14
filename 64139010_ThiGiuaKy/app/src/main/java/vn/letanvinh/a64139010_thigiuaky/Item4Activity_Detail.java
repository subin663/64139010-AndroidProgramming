package vn.letanvinh.a64139010_thigiuaky;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Item4Activity_Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item4_detail);
        TextView txtFb = findViewById(R.id.txtFb);
        TextView txtIns = findViewById(R.id.txtIns);
        TextView txtDescription = findViewById(R.id.txtDescription);
        ImageView imgBear = findViewById(R.id.imgBear);

        // Nhận dữ liệu từ Intent
        WBB wbb = (WBB) getIntent().getSerializableExtra("wbbData");

        if (wbb != null) {
            txtFb.setText("Facebook: " + wbb.getWbbFb());
            txtIns.setText("Instagram: " + wbb.getWbbIns());
            txtDescription.setText("Mô tả: " + wbb.getWbbDescription());

            String packageName = getPackageName();
            int imageID = getResources().getIdentifier(wbb.getWbbFileName(), "mipmap", packageName);
            imgBear.setImageResource(imageID);
        }
    }
}