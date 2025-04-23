package ntu.exam.buttonnavigation;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;


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
        FragmentManager fragmentManager = getSupportFragmentManager();
        bottomNav = findViewById(R.id.bot_nav);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int mnuItemDuocChonID = item.getItemId();
                if (mnuItemDuocChonID == R.id.mnu_home){
                   fragmentManager.beginTransaction()
                           .replace(R.id.fragmentContainerView, new HomeFragment())
                           .commit();
                    return true;

                }
                if (mnuItemDuocChonID == R.id.mnu_search){
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainerView, new SearchFragment())
                            .commit();
                    return true;

                }

                if (mnuItemDuocChonID == R.id.mnu_profile){
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainerView, new ProfileFragment())
                            .commit();
                    return true;

                }
                return false;
            }
        });
    }
}