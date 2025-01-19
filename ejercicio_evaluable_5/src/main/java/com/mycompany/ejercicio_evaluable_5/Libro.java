/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_evaluable_5;

/**
 *
 * @author Ana
 */
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String editorial;
    private EstadoLibro estado;
    private String fechaInicio;
    private String fechaFin;
    private String sinopsis;
    private String rutaImagen;

    // Enum para el estado del libro
    public enum EstadoLibro {
        LEIDO, NO_LEIDO, EN_CURSO, ABANDONADO;
    }

    public Libro(String titulo, String autor, String genero, String editorial, EstadoLibro estado, String fechaInicio, String fechaFin, String sinopsis, String rutaImagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.sinopsis = sinopsis;
        this.rutaImagen = rutaImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    
    @Override
    public String toString() {
        // Devuelve una representación en texto del libro
        return titulo + " - " + autor;
    }
    
    
}
