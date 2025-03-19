package ntu.exam.randomnumber;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnKiemTra, btnSo1, btnSo2, btnSo3, btnSo4, btnSo5, btnSo6, btnSo7, btnSo8, btnSo9;
    EditText edtSoA, edtSoB, edtKetQua, edtDapAn;
    void TimDieuKhien(){
        btnKiemTra = (Button) findViewById(R.id.btnKiemTra);
        btnSo1 = (Button) findViewById(R.id.btnSo1);
        btnSo2 = (Button) findViewById(R.id.btnSo2);
        btnSo3 = (Button) findViewById(R.id.btnSo3);
        btnSo4 = (Button) findViewById(R.id.btnSo4);
        btnSo5 = (Button) findViewById(R.id.btnSo5);
        btnSo6 = (Button) findViewById(R.id.btnSo6);
        btnSo7 = (Button) findViewById(R.id.btnSo7);
        btnSo8 = (Button) findViewById(R.id.btnSo8);
        btnSo9 = (Button) findViewById(R.id.btnSo9);
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        edtKetQua = (EditText) findViewById(R.id.edtKetQua);
        edtDapAn = (EditText) findViewById(R.id.edtDapAn);
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
    }
}