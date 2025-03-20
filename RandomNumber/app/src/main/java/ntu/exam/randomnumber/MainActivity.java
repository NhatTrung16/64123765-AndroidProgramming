package ntu.exam.randomnumber;

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

public class MainActivity extends AppCompatActivity {

    Button btnKiemTra, btnSo1, btnSo2, btnSo3, btnSo4, btnSo5, btnSo6, btnSo7, btnSo8, btnSo9;
    TextView tvSoA, tvSoB, tvKetQua, tvDapAn;
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
        tvSoA = (TextView) findViewById(R.id.tvSoA);
        tvSoB = (TextView) findViewById(R.id.tvSoB);
        tvKetQua = (TextView) findViewById(R.id.tvKetQua);
        tvDapAn = (TextView) findViewById(R.id.tvDapAn);
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
        //Sinh so ngau nhien
        int a = (int)(Math.random()*5);
        int b = (int)(Math.random()*5);
        int kqDung = (a+b);

        tvSoA.setText(String.valueOf(a));
        tvSoB.setText(String.valueOf(b));

        btnSo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("1");
            }
        });
        btnSo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("2");
            }
        });
        btnSo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("3");
            }
        });
        btnSo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("4");
            }
        });
        btnSo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("5");
            }
        });
        btnSo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("6");
            }
        });
        btnSo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("7");
            }
        });
        btnSo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("8");
            }
        });
        btnSo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDapAn.setText("9");
            }
        });

        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lấy dữ liệu từ tvDapAn về
                String strDapAn = tvDapAn.getText().toString();

                if(strDapAn.isEmpty()){
                    tvKetQua.setText("Bạn chưa chọn đáp án!");
                    return;
                }
                int dapan = Integer.parseInt(strDapAn);

                if(dapan == kqDung){
                    tvKetQua.setText("Kết quả đúng!");
                    tvKetQua.setTextColor(getResources().getColor(R.color.rightAS,null));
                }
                else {
                    tvKetQua.setText("Kết quả sai!");
                    tvKetQua.setTextColor(getResources().getColor(R.color.wrongAS,null));
                }
            }
        });
    }
}