package thigk2.NguyenNhatTrung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang2Activity extends AppCompatActivity {

    Button btnTinhTB;
    EditText edtDiemGKy, edtDiemCKy, edtKQua;

    void TimDieuKhien(){
        btnTinhTB = findViewById(R.id.btnTinhTB);
        edtDiemGKy = findViewById(R.id.edtDiemGky);
        edtDiemCKy = findViewById(R.id.edtDiemCKy);
        edtKQua = findViewById(R.id.edtKQua);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();

        btnTinhTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strDiemGKy = edtDiemGKy.getText().toString();
                String strDiemCKy = edtDiemCKy.getText().toString();

                float fDiemGKy = Float.parseFloat(strDiemGKy);
                float fDiemCKy = Float.parseFloat(strDiemCKy);

                float trungbinh = 0.5f*fDiemGKy + 0.5f*fDiemCKy;

                edtKQua.setText(String.valueOf(trungbinh));

            }
        });

    }
}