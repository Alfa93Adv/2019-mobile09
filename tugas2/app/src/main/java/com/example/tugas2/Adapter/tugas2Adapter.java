package com.example.tugas2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas2.Model.tugas2;
import com.example.tugas2.R;

import java.util.List;

public class tugas2Adapter extends RecyclerView.Adapter<tugas2Adapter.MyViewHolder> {
    List<tugas2> listsepatu;

    public tugas2Adapter(List<tugas2> listsepatu){
        this.listsepatu= listsepatu;
    }


    @NonNull
    @Override
    public tugas2Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemMobilView = layoutInflater.inflate(R.layout.sepatu,parent,false);
        tugas2Adapter.MyViewHolder viewHolder = new tugas2Adapter.MyViewHolder(itemMobilView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull tugas2Adapter.MyViewHolder holder, int position) {
        tugas2 sepatu = listsepatu.get(position);
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
