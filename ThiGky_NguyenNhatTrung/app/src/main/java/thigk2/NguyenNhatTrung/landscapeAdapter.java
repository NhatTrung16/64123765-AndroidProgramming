package thigk2.NguyenNhatTrung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class landscapeAdapter extends RecyclerView.Adapter<landscapeAdapter.ItemLandHolder> {

    Context context;
    ArrayList<landscape> lstData;

    public landscapeAdapter(Context context, ArrayList<landscape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        return new ItemLandHolder(vItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        landscape landscapeHienThi = lstData.get(position);

        String caption = landscapeHienThi.getLandCation();
        String timeStamp = landscapeHienThi.getLandTimeStamp(); // Giả sử có thêm dữ liệu thời gian
        String tenAnh = landscapeHienThi.getLandImageFileName();

        holder.tvCaption.setText(caption);
        holder.tvCaption2.setText(timeStamp); // Hiển thị thời gian

        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenAnh, "mipmap", packageName);
        holder.ivLandscape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption, tvCaption2; // Thêm TextView mới
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCation);
            tvCaption2 = itemView.findViewById(R.id.textViewCation2); // Khai báo TextView mới
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int viTriDuocClick = getAdapterPosition();
            landscape phantuduocchon = lstData.get(viTriDuocClick);

            String ten = phantuduocchon.getLandCation();
            String timeStamp = phantuduocchon.getLandTimeStamp(); // Lấy thời gian khi click
            String chuoiThongBao = "Bạn vừa click vào: " + ten + " lúc " + timeStamp;

            Toast.makeText(v.getContext(), chuoiThongBao, Toast.LENGTH_SHORT).show();
        }
    }
}