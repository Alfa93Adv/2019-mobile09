package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.tugas2.Adapter.tugas2Adapter;
import com.example.tugas2.Model.tugas2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSepatu;

    List<com.example.tugas2.Model.tugas2> tugas2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSepatu = findViewById(R.id.rvSepatu);

        com.example.tugas2.Model.tugas2 sepatu = new tugas2("1. Adidas", R.drawable.adidas);
        tugas2.add(sepatu);

        sepatu = new tugas2("2. Nike", R.drawable.nike);
        tugas2.add(sepatu);

        sepatu = new tugas2("3. Vans", R.drawable.vans);
        tugas2.add(sepatu);

        tugas2Adapter tugas2Adapter = new tugas2Adapter(tugas2);
        rvSepatu.setAdapter(tugas2Adapter);
        rvSepatu.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
    }
}
