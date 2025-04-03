package ntu.exam.test_gky;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau1Activity extends AppCompatActivity {

    Button btnTong;
    EditText edtsoA, edtsoB, edtKetQua;

    void TimDieuKhien(){
        btnTong = findViewById(R.id.btnTong);
        edtsoA = findViewById(R.id.edtsoA);
        edtsoB = findViewById(R.id.edtsoB);
        edtKetQua = findViewById(R.id.edtKetQua);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strsoA = edtsoA.getText().toString();
                String strsoB = edtsoB.getText().toString();

                float fsoA = Float.parseFloat(strsoA);
                float fsoB = Float.parseFloat(strsoB);

                float tong = fsoA + fsoB;

                String strKetqua =String.valueOf(tong);
                edtKetQua.setText(strKetqua);
            }
        });
    }
}