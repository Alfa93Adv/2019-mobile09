package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);

        SuperHero hero1 = new SuperHero("1. ", R.drawable.adidas);
        listSuperHero.add(hero1);

        SuperHero hero2 = new SuperHero("2. ", R.drawable.nike);
        listSuperHero.add(hero2);

        SuperHero hero3 = new SuperHero("3. ", R.drawable.vans);
        listSuperHero.add(hero3);

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
