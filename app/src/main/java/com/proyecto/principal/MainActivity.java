package com.proyecto.principal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.proyecto.principal.modelo.Item;
import com.proyecto.principal.modelo.Pelicula;
import com.proyecto.principal.modelo.Serie;
import com.proyecto.principal.ui.AdapterItems;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnPeliculas, btnSeries;
    private RecyclerView recyclerView;

    private ArrayList<Item> items = new ArrayList<Item>();
    private AdapterItems adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPeliculas=(Button)findViewById(R.id.btPeliculas);
        btnSeries=(Button)findViewById(R.id.btSeries);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        adapter = new AdapterItems(items,this);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(adapter);

        btnPeliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPeliculas();
            }
        });

        btnSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSeries();
            }
        });
    }

    public void getPeliculas(){
        items.clear();
        items.add(new Pelicula("Intensa-Mente","Pete Docter"));
        items.add(new Pelicula("El Renacido","Cine dramático/Suspenso","Alejandro González Iñárritu",2016,"2h 36m"));
        items.add(new Pelicula("Los miserables","Cine dramático/Cine romántico","Tom Hooper",2012,"2h 40m"));
        items.add(new Pelicula("Arráncame la vida","Drama/Cine romántico","Roberto Sneider",2008,"1h 47m"));
        items.add(new Pelicula());
        adapter.notifyDataSetChanged();

    }

    public void getSeries(){
        items.clear();
        items.add(new Serie("Sherlock", "Serie de televisión policíaca", "Sue Vertue", "1h 30m", 3));
        items.add(new Serie("Downton Abbey", "Julian Fellowes"));
        items.add(new Serie("Merlín", "Drama, Fantasía", "Julian Jones", "50m", 5));
        items.add(new Serie("Grey's Anatomy", "Drama médico", "Shonda Rhimes", "42m", 12));
        items.add(new Serie());
        adapter.notifyDataSetChanged();

    }

}