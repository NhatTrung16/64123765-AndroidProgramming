package ntu.exam.test_gky;

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

    Button btnCau1, btnCau2, btnCau3, btnCau4 ;
    void TimDieuKhien(){
        btnCau1 = findViewById(R.id.btnCau1);
        btnCau2 = findViewById(R.id.btnCau2);
        btnCau3 = findViewById(R.id.btnCau3);
        btnCau4 = findViewById(R.id.btnCau4);
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
        btnCau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCau1 = new Intent(MainActivity.this, Cau1Activity.class);
                startActivity(iCau1);
            }
        });
        btnCau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCau2 = new Intent(MainActivity.this, Cau2Activity.class);
                startActivity(iCau2);
            }
        });
        btnCau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCau3 = new Intent(MainActivity.this, Cau3Activity.class);
                startActivity(iCau3);
            }
        });
        btnCau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCau4 = new Intent(MainActivity.this, Cau4Activity.class);
                startActivity(iCau4);
            }
        });

    }
}