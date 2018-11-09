package com.example.bobrik.universitycook.Modelo;

public class Receta {

    private String titulo;
    private Integer imagen;
    private String ingredientes;
    private String preparacion;


    @Override
    public String toString() {
        return "Receta{" +
                "titulo='" + titulo + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", preparacion='" + preparacion + '\'' +
                ", imagen=" + imagen +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public Integer getImagen() {
        return imagen;
    }

    public Receta(String titulo, Integer imagen, String ingredientes, String preparacion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }
}


