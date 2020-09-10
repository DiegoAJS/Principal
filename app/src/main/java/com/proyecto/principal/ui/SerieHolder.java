package com.proyecto.principal.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.proyecto.principal.R;
import com.proyecto.principal.modelo.Pelicula;
import com.proyecto.principal.modelo.Serie;

public class SerieHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView tvTituloSerie, tvGeneroSerie, tvCreadorSerie, tvTemporadasSeries;
    private ItemClickListener listener;

    public SerieHolder(View v, ItemClickListener listener){
        super(v);

        tvTituloSerie = (TextView)v.findViewById(R.id.tv_titulo_series);
        tvGeneroSerie = (TextView)v.findViewById(R.id.tv_genero_series);
        tvCreadorSerie = (TextView)v.findViewById(R.id.tv_creador_series);;
        tvTemporadasSeries = (TextView)v.findViewById(R.id.tv_temporadas_series);;
        this.listener = listener;
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        listener.onItemClick(v, getAdapterPosition());
    }

    public void bindData(Context context, Serie serie){
        tvTituloSerie.setText(serie.getTitulo());
        tvGeneroSerie.setText(serie.getGenero());
        tvCreadorSerie.setText(serie.getCreador());
        tvTemporadasSeries.setText("Temporadas: "+String.valueOf(serie.getnTemporadas()));
    }
}
