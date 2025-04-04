package thigk2.NguyenNhatTrung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ChucNang3Activity extends AppCompatActivity {

    ListView lvMonHoc;
    ArrayList<String> dsMonHoc;

    void TimDieuKhien() {
        lvMonHoc = findViewById(R.id.lvMonHoc);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TimDieuKhien();
        dsMonHoc = new ArrayList<String>();
        dsMonHoc.add("Tin học đại cương");
        dsMonHoc.add("Lập trình Java");
        dsMonHoc.add("Phát triển Ứng dụng web");
        dsMonHoc.add("Khai phá dữ liệu lớn");
        dsMonHoc.add("Kinh tế chính trị Mác-Lê nin");
        ArrayAdapter<String> adapterMonHoc;
        adapterMonHoc = new ArrayAdapter<String>(ChucNang3Activity.this, android.R.layout.simple_list_item_1, dsMonHoc);

        lvMonHoc.setAdapter(adapterMonHoc);

        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent iItem3 = new Intent(ChucNang3Activity.this, Item3Activity.class);
                    startActivity(iItem3);
                }
                if (position == 1) {
                    Intent iItem3 = new Intent(ChucNang3Activity.this, Item3Activity.class);
                    startActivity(iItem3);
                }
                if (position == 2) {
                    Intent iItem3 = new Intent(ChucNang3Activity.this, Item3Activity.class);
                    startActivity(iItem3);
                }
                if (position == 3) {
                    Intent iItem3 = new Intent(ChucNang3Activity.this, Item3Activity.class);
                    startActivity(iItem3);
                }
                if (position == 4) {
                    Intent iItem3 = new Intent(ChucNang3Activity.this, Item3Activity.class);
                    startActivity(iItem3);
                }
            }
        });


    }
}