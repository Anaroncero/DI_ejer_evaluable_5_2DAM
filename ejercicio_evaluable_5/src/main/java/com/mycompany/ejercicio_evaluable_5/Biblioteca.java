/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_evaluable_5;

import java.util.ArrayList;

/**
 *
 * @author Ana
 */
public class Biblioteca {

    private ArrayList<Libro> libros;
    private int contador;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.contador = 0;
    }

    public void agregarLibro(Libro libro) { //recibe un objeto de tipo libro
        libros.add(libro); //se agrega al arrray
        contador++; 

    }

    public boolean eliminarLibro(int indice) {
        if(indice >= 0 && indice < libros.size()){
        libros.remove(indice);
        return true;
        }
        return false;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public ArrayList<Libro> mostrarListaLibros(){
    return libros;
    }
    
    public Libro buscarLibro(String titulo, String autor) {
    // Recorremos la biblioteca (una lista de objetos Libro) para buscar el libro
    for (Libro libro : libros) {
        if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.getAutor().equalsIgnoreCase(autor)) {
            return libro;  // Si encontramos una coincidencia, devolvemos el libro
        }
    }
    return null;  // Si no encontramos el libro
}
    
    public boolean eliminarLibro(Libro libro) {
    return libros.remove(libro); // Elimina el libro de la lista
}

}
