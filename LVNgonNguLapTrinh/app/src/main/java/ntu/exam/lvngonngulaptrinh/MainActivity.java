package ntu.exam.lvngonngulaptrinh;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewNNLT;
    ArrayList<String> dsNgonNguLT;

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
        listViewNNLT = findViewById(R.id.LView);
        //chbi data
        dsNgonNguLT = new ArrayList<String>();
        dsNgonNguLT.add("Python");
        dsNgonNguLT.add("PHP");
        dsNgonNguLT.add("Java");
        dsNgonNguLT.add("C/C++");
        dsNgonNguLT.add("R");
        // b2
        ArrayAdapter<String> adapterNNLT;
        adapterNNLT = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsNgonNguLT);

        //b3 gan adapter
        listViewNNLT.setAdapter(adapterNNLT);

        //b4 gắn bộ lắng nghe và xử lý sk
        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //biến position đã chứa vị trí của item được click
                String giatriduocchon = dsNgonNguLT.get(position);
                //làm theo yêu cầu bất kỳ đói với giá trị get được
                //vd toast lên
                Toast.makeText(MainActivity.this, giatriduocchon, Toast.LENGTH_LONG).show();
            }
        });

    }

}