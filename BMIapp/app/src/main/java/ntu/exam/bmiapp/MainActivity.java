package ntu.exam.bmiapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtChieuCao, edtCanNang;
    Button btnTinhBMI;
    TextView tvKetQua;

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
        // Tìm đkhien
        edtChieuCao = findViewById(R.id.edtChieuCao);
        edtCanNang = findViewById(R.id.edtCanNang);
        btnTinhBMI = findViewById(R.id.btnTinhBMI);
        tvKetQua = findViewById(R.id.tvKetQua);

        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhBMI();
            }
        });
    }
    public void tinhBMI(){
        String strChieuCao = edtChieuCao.getText().toString().trim();
        String strCanNang = edtCanNang.getText().toString().trim();

        if (strChieuCao.isEmpty() || strCanNang.isEmpty()) {
            tvKetQua.setText("Vui lòng nhập đầy đủ thông tin!");
            return;
        }
        float chieuCao = Float.parseFloat(strChieuCao);
        float canNang = Float.parseFloat(strCanNang);

        if (chieuCao <= 0 || canNang <= 0) {
            tvKetQua.setText("Chiều cao và cân nặng phải lớn hơn 0!");
            return;
        }

        // đổi chiều cao cm ra m để tính
        chieuCao = chieuCao / 100;

        // bmi = can nang / 2 lan chieu cao
        float bmi = canNang / (chieuCao * chieuCao);

        String danhGia;
        if (bmi < 18.5) {
            danhGia = "Gầy";
        } else if (bmi < 24.9) {
            danhGia = "Bình thường";
        } else if (bmi < 29.9) {
            danhGia = "Thừa cân";
        } else {
            danhGia = "Béo phì";
        }

        tvKetQua.setText("BMI: " + String.format("%.2f", bmi) + " - " + danhGia);
    }
}