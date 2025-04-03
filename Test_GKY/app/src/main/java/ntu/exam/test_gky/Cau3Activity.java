package ntu.exam.test_gky;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cau3Activity extends AppCompatActivity {

    landscapeAdapter landscapeAdapter;
    ArrayList<landscape> recyclerViewData;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau3);
        recyclerViewData = getDataForRecyclerView();
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);
        landscapeAdapter = new landscapeAdapter(this, recyclerViewData);
        recyclerViewLandscape.setAdapter(landscapeAdapter);
    }
    ArrayList<landscape> getDataForRecyclerView() {
        ArrayList<landscape> dsDuLieu = new ArrayList<landscape>();
        dsDuLieu.add(new landscape("hanoi", "Hà Nội"));
        dsDuLieu.add(new landscape("effel_tower", "Tháp Effel"));
        return dsDuLieu;
    }
}