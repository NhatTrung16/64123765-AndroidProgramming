package thigk2.NguyenNhatTrung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnCn2, btnCn3, btnCn4, btnAbtMe ;
    void TimDieuKhien(){
        btnCn2 = findViewById(R.id.btnCn2);
        btnCn3 = findViewById(R.id.btnCn3);
        btnCn4 = findViewById(R.id.btnCn4);
        btnAbtMe = findViewById(R.id.btnAbtMe);
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

        btnCn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCn2 = new Intent(MainActivity.this, ChucNang2Activity.class);
                startActivity(iCn2);
            }
        });

        btnCn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCn3 = new Intent(MainActivity.this, ChucNang3Activity.class);
                startActivity(iCn3);
            }
        });

        btnCn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCn4 = new Intent(MainActivity.this, ChucNang4Activity.class);
                startActivity(iCn4);
            }
        });

        btnAbtMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iAbtMe = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(iAbtMe);
            }
        });
    }
}