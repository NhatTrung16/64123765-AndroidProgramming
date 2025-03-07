package ntu.exam.ex5_addsubmuldiv_var;

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

    //Khai báo những đối tượng tìm kiếm
    EditText so1;
    EditText so2;
    EditText kqua;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien(){
        so1 = (EditText)findViewById(R.id.edtSo1);
        so2 = (EditText)findViewById(R.id.edtSo2);
        kqua = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
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
        //Gắn bộ lắng nghe sk và code xử lý cho từng nút (var)
        nutCong.setOnClickListener(bolangnghe_XuLyCong);
        nutTru.setOnClickListener(bolangnghe_XuLyTru);
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia();
            }
        });
    }

    View.OnClickListener bolangnghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //b1.1 lấy data từ 2 điều khiển trên
            String strso1 =so1.getText().toString();
            String strso2 =so2.getText().toString();
            //b1.3 chuyển data từ chuỗi sang số
            float fso1 = Float.parseFloat(strso1);
            float fso2 = Float.parseFloat(strso2);

            //b2 tính toán
            float Tong = fso1 + fso2;
            //b3 hiện kết quả
            // cbi data xuất, biến thành dạng chuỗi
            String strkqua = String.valueOf(Tong);
            //gắn kqua lên đk
            kqua.setText(strkqua);
        }
    };

    View.OnClickListener bolangnghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //b1.1 lấy data từ 2 điều khiển trên
            String strso1 =so1.getText().toString();
            String strso2 =so2.getText().toString();
            //b1.3 chuyển data từ chuỗi sang số
            float fso1 = Float.parseFloat(strso1);
            float fso2 = Float.parseFloat(strso2);

            //b2 tính toán
            float Hieu = fso1 - fso2;
            //b3 hiện kết quả
            // cbi data xuất, biến thành dạng chuỗi
            String strkqua = String.valueOf(Hieu);
            //gắn kqua lên đk
            kqua.setText(strkqua);
        }
    };
    void XuLyNhan(){
        //b1.1 lấy data từ 2 điều khiển trên
        String strso1 =so1.getText().toString();
        String strso2 =so2.getText().toString();
        //b1.3 chuyển data từ chuỗi sang số
        float fso1 = Float.parseFloat(strso1);
        float fso2 = Float.parseFloat(strso2);

        //b2 tính toán
        float Tich = fso1 * fso2;
        //b3 hiện kết quả
        // cbi data xuất, biến thành dạng chuỗi
        String strkqua = String.valueOf(Tich);
        //gắn kqua lên đk
        kqua.setText(strkqua);
    }
    void XuLyChia(){
        //b1.1 lấy data từ 2 điều khiển trên
        String strso1 =so1.getText().toString();
        String strso2 =so2.getText().toString();
        //b1.3 chuyển data từ chuỗi sang số
        float fso1 = Float.parseFloat(strso1);
        float fso2 = Float.parseFloat(strso2);

        //b2 tính toán
        float Thuong = fso1 / fso2;
        //b3 hiện kết quả
        // cbi data xuất, biến thành dạng chuỗi
        String strkqua = String.valueOf(Thuong);
        //gắn kqua lên đk
        kqua.setText(strkqua);
    }

}