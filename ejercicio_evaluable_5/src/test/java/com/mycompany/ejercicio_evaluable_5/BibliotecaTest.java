/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejercicio_evaluable_5;

import java.util.ArrayList;
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
public class BibliotecaTest {

    public BibliotecaTest() {
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

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico",
                "Editorial XYZ", Libro.EstadoLibro.LEIDO, "01/01/2000", "01/01/2001",
                "Sinopsis del libro", "ruta_imagen_1.jpg");
        libro2 = new Libro("1984", "George Orwell", "Distopía", "Editorial ABC",
                Libro.EstadoLibro.NO_LEIDO, "01/01/2015", "01/01/2016",
                "Sinopsis del libro 1984", "ruta_imagen_2.jpg");
    }

    @Test
    public void testAgregarLibro() {
        biblioteca.agregarLibro(libro1);
        assertEquals(1, biblioteca.getContador());
        assertTrue(biblioteca.mostrarListaLibros().contains(libro1));
    }

    @Test
    public void testEliminarLibroPorIndice() {
        biblioteca.agregarLibro(libro1);
        assertTrue(biblioteca.eliminarLibro(0));
        assertEquals(0, biblioteca.getContador());
        assertFalse(biblioteca.mostrarListaLibros().contains(libro1));
    }

    @Test
    public void testEliminarLibroPorObjeto() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        assertTrue(biblioteca.eliminarLibro(libro1));
        assertEquals(1, biblioteca.getContador());
        assertFalse(biblioteca.mostrarListaLibros().contains(libro1));
        assertTrue(biblioteca.mostrarListaLibros().contains(libro2));
    }

    @Test
    public void testBuscarLibro() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        Libro resultado = biblioteca.buscarLibro("1984", "George Orwell");
        assertNotNull(resultado);
        assertEquals(libro2, resultado);
    }

    @Test
    public void testBuscarLibroNoExistente() {
        biblioteca.agregarLibro(libro1);

        Libro resultado = biblioteca.buscarLibro("No Existente", "Autor Desconocido");
        assertNull(resultado);
    }
}

