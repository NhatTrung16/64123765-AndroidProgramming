package ntu.exam.calculatorappjv;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo những đối tượng tìm kiếm
    EditText so1;
    EditText so2;
    EditText kqua;
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
    }
    void TimDieuKhien(){
        so1 = (EditText)findViewById(R.id.edtSo1);
        so2 = (EditText)findViewById(R.id.edtSo2);
        kqua = (EditText)findViewById(R.id.edtKQ);
    }
    public void XuLyCong(View v){
        //b1 lấy data từ 2 số
//        EditText so1 = (EditText)findViewById(R.id.edtSo1);
//        EditText so2 = (EditText)findViewById(R.id.edtSo2);
        //b1.1 lấy data từ 2 điều khiển trên
        String strso1 =so1.getText().toString();
        String strso2 =so2.getText().toString();
        //b1.3 chuyển data từ chuỗi sang số
        float fso1 = Float.parseFloat(strso1);
        float fso2 = Float.parseFloat(strso2);

        //b2 tính toán
        float Tong = fso1 + fso2;
        //b3 hiện kết quả
        // tìm data
//        EditText kqua = (EditText)findViewById(R.id.edtKQ);
        // cbi data xuất, biến thành dạng chuỗi
        String strkqua = String.valueOf(Tong);
        //gắn kqua lên đk
        kqua.setText(strkqua);
    }
    public void XuLyTru(View v){
        //b1 lấy data từ 2 số
//        EditText so1 = (EditText)findViewById(R.id.edtSo1);
//        EditText so2 = (EditText)findViewById(R.id.edtSo2);
        //b1.1 lấy data từ 2 điều khiển trên
        String strso1 =so1.getText().toString();
        String strso2 =so2.getText().toString();
        //b1.3 chuyển data từ chuỗi sang số
        float fso1 = Float.parseFloat(strso1);
        float fso2 = Float.parseFloat(strso2);

        //b2 tính toán
        float Hieu = fso1 - fso2;
        //b3 hiện kết quả
        // tìm data
//        EditText kqua = (EditText)findViewById(R.id.edtKQ);
        // cbi data xuất, biến thành dạng chuỗi
        String strkqua = String.valueOf(Hieu);
        //gắn kqua lên đk
        kqua.setText(strkqua);
    }
    public void XuLyNhan(View v){
        //b1 lấy data từ 2 số
//        EditText so1 = (EditText)findViewById(R.id.edtSo1);
//        EditText so2 = (EditText)findViewById(R.id.edtSo2);
        //b1.1 lấy data từ 2 điều khiển trên
        String strso1 =so1.getText().toString();
        String strso2 =so2.getText().toString();
        //b1.3 chuyển data từ chuỗi sang số
        float fso1 = Float.parseFloat(strso1);
        float fso2 = Float.parseFloat(strso2);

        //b2 tính toán
        float Tich = fso1 * fso2;
        //b3 hiện kết quả
        // tìm data
//        EditText kqua = (EditText)findViewById(R.id.edtKQ);
        // cbi data xuất, biến thành dạng chuỗi
        String strkqua = String.valueOf(Tich);
        //gắn kqua lên đk
        kqua.setText(strkqua);
    }
    public void XuLyChia(View v){
        //b1 lấy data từ 2 số
//        EditText so1 = (EditText)findViewById(R.id.edtSo1);
//        EditText so2 = (EditText)findViewById(R.id.edtSo2);
        //b1.1 lấy data từ 2 điều khiển trên
        String strso1 =so1.getText().toString();
        String strso2 =so2.getText().toString();
        //b1.3 chuyển data từ chuỗi sang số
        float fso1 = Float.parseFloat(strso1);
        float fso2 = Float.parseFloat(strso2);

        //b2 tính toán
        float Thuong = fso1 / fso2;
        //b3 hiện kết quả
        // tìm data
//        EditText kqua = (EditText)findViewById(R.id.edtKQ);
        // cbi data xuất, biến thành dạng chuỗi
        String strkqua = String.valueOf(Thuong);
        //gắn kqua lên đk
        kqua.setText(strkqua);
    }

}