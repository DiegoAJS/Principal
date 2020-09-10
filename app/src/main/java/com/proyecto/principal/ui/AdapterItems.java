package com.proyecto.principal.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proyecto.principal.ActivitySecond;
import com.proyecto.principal.R;
import com.proyecto.principal.modelo.Item;
import com.proyecto.principal.modelo.Pelicula;
import com.proyecto.principal.modelo.Serie;

import java.util.List;

public class AdapterItems<T>  extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ItemClickListener {

    private Context context;
    private List<Item> items;

    private static final int TYPE_PELICULA = 0;
    private static final int TYPE_SERIES = 1;

    public AdapterItems(@NonNull List<Item> items, Context context) {
        this.items = items;
        this.context=context;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Pelicula) {
            return TYPE_PELICULA;
        } if (items.get(position) instanceof Serie) {
            return TYPE_SERIES;
        } else
            throw new RuntimeException("ItemViewType unknown");
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        RecyclerView.ViewHolder viewHolder=null;
        switch (viewType){
            case TYPE_PELICULA:
                viewHolder = new PeliculaHolder(inflater.inflate(R.layout.item_pelicula,parent,false),this);break;
            case TYPE_SERIES:
                viewHolder = new SerieHolder(inflater.inflate(R.layout.item_series,parent,false),this);break;

        }
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position)==TYPE_PELICULA){
            ((PeliculaHolder)holder).bindData(context,(Pelicula) items.get(position));
        }
        if(getItemViewType(position)==TYPE_SERIES){
            ((SerieHolder)holder).bindData(context,(Serie) items.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onItemClick(View view, int position) {
        switch (getItemViewType(position)){
            case TYPE_PELICULA:
                ActivitySecond.createInstance(context, ((Pelicula) items.get(position)).getTitulo(),((Pelicula) items.get(position)).toString());break;
            case TYPE_SERIES:
                ActivitySecond.createInstance(context, ((Serie) items.get(position)).getTitulo(),((Serie) items.get(position)).toString());break;
        }


    }
}
