package vn.letanvinh.bottomnavigationview;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav=findViewById(R.id.bot_nav);
        FragmentManager fragmentManager=getSupportFragmentManager();
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int mnuItemDuocChonID=item.getItemId();
                if (mnuItemDuocChonID==R.id.mnu_home){
                    //thay fragment
                    fragmentManager.beginTransaction().replace(R.id.fragmentContainerView,new HomeFragment()).commit();
                    Toast.makeText(MainActivity.this, "Thay Home",Toast.LENGTH_LONG).show();
                }
                else if(mnuItemDuocChonID==R.id.mnu_search){
                    fragmentManager.beginTransaction().replace(R.id.fragmentContainerView,new SearchFragment()).commit();
                    Toast.makeText(MainActivity.this,"Thay Search",Toast.LENGTH_LONG).show();
                }
                else if(mnuItemDuocChonID==R.id.mnu_profile){
                    fragmentManager.beginTransaction().replace(R.id.fragmentContainerView,new ProfileFragment()).commit();
                    Toast.makeText(MainActivity.this,"Thay Profile",Toast.LENGTH_LONG).show();
                }
                else{
                    return true;
                }

                return false;
            }
        });
    }
}