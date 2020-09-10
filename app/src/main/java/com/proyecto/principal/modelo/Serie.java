package com.proyecto.principal.modelo;

public class Serie extends Articulo {

    private int nTemporadas=1;
    //    Sus atributos son titulo, no. de temporadas, visto, genero, creador y duracion.

    public Serie() {
        super();
        this.nTemporadas=1;
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }

    public Serie(String titulo, String genero, String creador, String duracion, int nTemporadas) {
        super(titulo, genero, creador, duracion);
        this.nTemporadas = nTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", visto=" + visto + ", genero=" + genero + ", creador=" + creador + ", duracion=" + duracion + '}';
    }


}
