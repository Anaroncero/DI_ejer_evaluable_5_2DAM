/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejercicio_evaluable_5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ana
 */
public class LibroTest {

    public LibroTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @After
    public void tearDown() {
    }

    private Libro libro;

    @Before
    public void setUp() {
        libro = new Libro(
                "El nombre del viento",
                "Patrick Rothfuss",
                "Fantasía",
                "Plaza & Janés",
                Libro.EstadoLibro.LEIDO,
                "2022-01-01",
                "2022-01-15",
                "Una obra maestra de la fantasía moderna.",
                "/imagenes/el_nombre_del_viento.jpg"
        );
    }

    @Test
    public void testConstructor() {
        //Comprobar que el constructor verifica los valores
        assertEquals("El nombre del viento", libro.getTitulo());
        assertEquals("Patrick Rothfuss", libro.getAutor());
        assertEquals("Fantasía", libro.getGenero());
        assertEquals("Plaza & Janés", libro.getEditorial());
        assertEquals(Libro.EstadoLibro.LEIDO, libro.getEstado());
        assertEquals("2022-01-01", libro.getFechaInicio());
        assertEquals("2022-01-15", libro.getFechaFin());
        assertEquals("Una obra maestra de la fantasía moderna.", libro.getSinopsis());
        assertEquals("/imagenes/el_nombre_del_viento.jpg", libro.getRutaImagen());
    }

    @Test
    public void testGettersAndSetters() {
        // Probar los setters y getters
        libro.setTitulo("El temor de un hombre sabio");
        assertEquals("El temor de un hombre sabio", libro.getTitulo());

        libro.setAutor("Otro Autor");
        assertEquals("Otro Autor", libro.getAutor());

        libro.setGenero("Ciencia Ficción");
        assertEquals("Ciencia Ficción", libro.getGenero());

        libro.setEditorial("Editorial Nueva");
        assertEquals("Editorial Nueva", libro.getEditorial());

        libro.setEstado(Libro.EstadoLibro.EN_CURSO);
        assertEquals(Libro.EstadoLibro.EN_CURSO, libro.getEstado());

        libro.setFechaInicio("2023-01-01");
        assertEquals("2023-01-01", libro.getFechaInicio());

        libro.setFechaFin("2023-01-10");
        assertEquals("2023-01-10", libro.getFechaFin());

        libro.setSinopsis("Nueva sinopsis");
        assertEquals("Nueva sinopsis", libro.getSinopsis());

        libro.setRutaImagen("/imagenes/nueva_imagen.jpg");
        assertEquals("/imagenes/nueva_imagen.jpg", libro.getRutaImagen());
    }

    @Test
    public void testToString() {
        // Verificar que el método toString funciona 
        assertEquals("El nombre del viento - Patrick Rothfuss", libro.toString());

        libro.setTitulo("Nuevo Título");
        libro.setAutor("Nuevo Autor");
        assertEquals("Nuevo Título - Nuevo Autor", libro.toString());
    }
}


