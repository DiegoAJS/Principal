package com.proyecto.principal.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.proyecto.principal.R;
import com.proyecto.principal.modelo.Pelicula;

public class PeliculaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView tvTituloPelicula, tvGeneroPelicula, tvCreadorPelicula;
    private ItemClickListener listener;

    public PeliculaHolder(View v, ItemClickListener listener){
        super(v);

        tvTituloPelicula = (TextView)v.findViewById(R.id.tv_titulo_pelicula);
        tvGeneroPelicula = (TextView)v.findViewById(R.id.tv_genero_pelicula);
        tvCreadorPelicula = (TextView)v.findViewById(R.id.tv_creador_pelicula);;
        this.listener = listener;
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        listener.onItemClick(v, getAdapterPosition());
    }

    public void bindData(Context context, Pelicula pelicula){
        tvTituloPelicula.setText(pelicula.getTitulo());
        tvGeneroPelicula.setText(pelicula.getGenero());
        tvCreadorPelicula.setText(pelicula.getCreador());
    }

}
