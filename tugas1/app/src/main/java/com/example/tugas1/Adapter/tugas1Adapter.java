package com.example.tugas1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas1.Model.tugas1;
import com.example.tugas1.R;

import java.util.List;

public class tugas1Adapter extends RecyclerView.Adapter<tugas1Adapter.MyViewHolder>{

    List<tugas1> listsepatu;

    public tugas1Adapter(List<tugas1> listsepatu){
        this.listsepatu= listsepatu;
    }



    @NonNull
    @Override
    public tugas1Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemMobilView = layoutInflater.inflate(R.layout.sepatu,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(itemMobilView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull tugas1Adapter.MyViewHolder holder, int position) {
        tugas1 sepatu = listsepatu.get(position);
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
