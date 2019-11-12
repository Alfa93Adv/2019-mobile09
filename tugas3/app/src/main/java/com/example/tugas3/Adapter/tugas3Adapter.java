package com.example.tugas3.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas3.Model.tugas3;
import com.example.tugas3.R;

import java.util.List;

public class tugas3Adapter extends RecyclerView.Adapter<tugas3Adapter.MyViewHolder> {
    List<tugas3> listsepatu;

    public tugas3Adapter(List<tugas3> listsepatu){
        this.listsepatu= listsepatu;
    }


    @NonNull
    @Override
    public tugas3Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemMobilView = layoutInflater.inflate(R.layout.sepatu,parent,false);
        tugas3Adapter.MyViewHolder viewHolder = new tugas3Adapter.MyViewHolder(itemMobilView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull tugas3Adapter.MyViewHolder holder, int position) {
        tugas3 sepatu = listsepatu.get(position);
        holder.nama.setText(sepatu.getSepatu());
        holder.gambar.setImageResource(sepatu.getUrut());
    }

    @Override
    public int getItemCount() {
        return (listsepatu != null) ? listsepatu.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView nama;
        public ImageView gambar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.nama);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
