package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas3.Adapter.tugas3Adapter;
import com.example.tugas3.Model.tugas3;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSepatu;

    List<com.example.tugas3.Model.tugas3> tugas3 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSepatu = findViewById(R.id.rvSepatu);

        com.example.tugas3.Model.tugas3 sepatu = new tugas3("1. Adidas", R.drawable.adidas);
        tugas3.add(sepatu);

        sepatu = new tugas3("2. Nike", R.drawable.nike);
        tugas3.add(sepatu);

        sepatu = new tugas3("3. Vans", R.drawable.vans);
        tugas3.add(sepatu);

        tugas3Adapter tugas3Adapter = new tugas3Adapter(tugas3);
        rvSepatu.setAdapter(tugas3Adapter);
        rvSepatu.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
