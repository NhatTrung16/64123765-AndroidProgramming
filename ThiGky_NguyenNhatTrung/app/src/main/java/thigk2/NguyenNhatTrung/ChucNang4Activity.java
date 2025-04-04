package thigk2.NguyenNhatTrung;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ChucNang4Activity extends AppCompatActivity {

    landscapeAdapter landscapeAdapter;
    ArrayList<landscape> recyclerViewData;
    RecyclerView recyclerViewLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang4);

        recyclerViewData = getDataForRecyclerView();
        recyclerViewLandscape = findViewById(R.id.recyclerLand);

        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);

        landscapeAdapter = new landscapeAdapter(this, recyclerViewData);
        recyclerViewLandscape.setAdapter(landscapeAdapter);
    }

    ArrayList<landscape> getDataForRecyclerView() {
        ArrayList<landscape> dsDuLieu = new ArrayList<>();

        dsDuLieu.add(new landscape("hay_trao_cho_anh_22", "Bài hát:Hãy Trao Cho Anh", "16:30 - 04/04/2025"));
        dsDuLieu.add(new landscape("chay_ngay_di", "Bài hát:Chạy Ngay Đi", "14:50 - 03/04/2025"));
        dsDuLieu.add(new landscape("muon_roi_ma_sao_con", "Bài hát:Muộn rồi mà sao còn", "10:20 - 02/04/2025"));

        return dsDuLieu;
    }
}