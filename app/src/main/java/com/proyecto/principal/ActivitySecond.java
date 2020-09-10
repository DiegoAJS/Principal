package com.proyecto.principal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySecond extends AppCompatActivity {

    public static final String Title="title";
    public static final String Texto="texto";

    private TextView tvTitulo;
    private TextView tvTexto;

    public static void createInstance(Context context, String title, String texto) {
        Intent intent = getLaunchIntent(context,title,texto);
        context.startActivity(intent);
    }

    public static Intent getLaunchIntent(Context context, String title, String texto) {
        Intent intent = new Intent(context, ActivitySecond.class);
        intent.putExtra(Title,title);
        intent.putExtra(Texto,texto);
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvTitulo=(TextView)findViewById(R.id.tv_title_second);
        tvTexto=(TextView)findViewById(R.id.tv_texto_second);

        String title= getIntent().getStringExtra(Title);
        String texto= getIntent().getStringExtra(Texto);

        tvTitulo.setText(title);
        tvTexto.setText(texto);
    }
}
