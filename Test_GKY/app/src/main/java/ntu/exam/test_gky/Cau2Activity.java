package ntu.exam.test_gky;

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
import java.util.List;

public class Cau2Activity extends AppCompatActivity {

    ListView lvBaiHat;
    ArrayList dsBaiHat;

    void TimDieuKhien(){
        lvBaiHat = findViewById(R.id.lvBaiHat);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();

        dsBaiHat = new ArrayList<String>();
        dsBaiHat.add("Muon roi ma sao con");
        dsBaiHat.add("Hay Trao Cho Anh");
        ArrayAdapter<String> adapterBaiHat;
        adapterBaiHat = new ArrayAdapter<String>(Cau2Activity.this, android.R.layout.simple_list_item_1, dsBaiHat);

        lvBaiHat.setAdapter(adapterBaiHat);

        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) { // Kiểm tra nếu chọn "Muon roi ma sao con"
                    Intent iMRMSC = new Intent(Cau2Activity.this, LVBH_MRMSCActivity.class);
                    startActivity(iMRMSC);
                }
                if (position == 1) { // Kiểm tra nếu chọn "Hay trao cho anh"
                    Intent iHTCA = new Intent(Cau2Activity.this, LVBH_HTCAActivity.class);
                    startActivity(iHTCA);
                }
            }
        });


    }
}