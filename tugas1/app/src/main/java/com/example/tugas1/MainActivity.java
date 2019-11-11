package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas1.Adapter.tugas1Adapter;
import com.example.tugas1.Model.tugas1;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSepatu;

    List<tugas1> tugas1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSepatu = findViewById(R.id.rvSepatu);

        tugas1 sepatu = new tugas1("1. Adidas", R.drawable.adidas);
        tugas1.add(sepatu);

        sepatu = new tugas1("2. Nike", R.drawable.nike);
        tugas1.add(sepatu);

        sepatu = new tugas1("3. Vans", R.drawable.vans);
        tugas1.add(sepatu);

        tugas1Adapter tugas1Adapter = new tugas1Adapter(tugas1);
        rvSepatu.setAdapter(tugas1Adapter);
        rvSepatu.setLayoutManager(new LinearLayoutManager(this));
    }
}
