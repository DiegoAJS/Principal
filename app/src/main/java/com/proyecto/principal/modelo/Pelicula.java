package com.proyecto.principal.modelo;

public class Pelicula extends Articulo {
    private int anio;

    //titulo, genero, creador, aÃ±o, duracion y visto

    public Pelicula() {
        super();

    }

    public Pelicula(String titulo, String creador) {
        super(titulo, creador);

    }

    public Pelicula(String titulo, String genero, String creador, int anio, String duracion) {
        super(titulo, genero, creador, duracion);
        this.anio = anio;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", anio=" + anio + ", duracion=" + duracion + ", visto=" + visto + '}';
    }


}
