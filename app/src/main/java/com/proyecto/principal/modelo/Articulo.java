package com.proyecto.principal.modelo;

public class Articulo extends Item implements IVisualizable{

    protected String titulo;
    protected String genero;
    protected String creador;
    protected String duracion;
    protected String tiempoVisto="00:00";
    protected boolean visto=false;

    public Articulo() {
        this.visto=false;
    }

    public Articulo(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Articulo(String titulo, String genero, String creador, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    @Override
    public void marcarVisto(String tiempVisto) {
        this.tiempoVisto=tiempVisto;
        this.visto=true;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public String tiempoVisto() {
        return null;
    }

    public String getTiempoVisto() {
        return tiempoVisto;
    }

    public String mostrarTiempoVisto(){
        System.out.println("asd \t asdf");
        return this.titulo+" \t\t "+this.tiempoVisto;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setTiempoVisto(String tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
