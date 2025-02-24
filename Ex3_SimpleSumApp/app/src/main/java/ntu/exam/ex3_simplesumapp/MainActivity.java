package ntu.exam.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //gắn layout tương ứng với file
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view){
        //tìm, tham chiếu đến điều khiển trên tệp XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKQ = findViewById(R.id.edtKqua);
        //Lấy data về
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();
        //Chuyển data sang dạng số
        int soA=Integer.parseInt(strA);
        int soB=Integer.parseInt(strB);
        //Tính toán theo y'c
        int tong = soA + soB;
        String strTong = String.valueOf(tong); //chuyển kqua sang chuỗi

        //Hiện ra màn hình kqua

        editTextKQ.setText(strTong);

    }
}