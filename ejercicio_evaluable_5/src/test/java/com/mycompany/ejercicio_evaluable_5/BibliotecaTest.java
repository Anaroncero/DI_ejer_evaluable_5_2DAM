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
 * @author Usuario
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
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarLibro method, of class Biblioteca.
     */
    @Test
    public void testAgregarLibro() {
        System.out.println("agregarLibro");
        Libro libro = null;
        Biblioteca instance = new Biblioteca();
        instance.agregarLibro(libro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLibro method, of class Biblioteca.
     */
    @Test
    public void testEliminarLibro_int() {
        System.out.println("eliminarLibro");
        int indice = 0;
        Biblioteca instance = new Biblioteca();
        boolean expResult = false;
        boolean result = instance.eliminarLibro(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContador method, of class Biblioteca.
     */
    @Test
    public void testGetContador() {
        System.out.println("getContador");
        Biblioteca instance = new Biblioteca();
        int expResult = 0;
        int result = instance.getContador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContador method, of class Biblioteca.
     */
    @Test
    public void testSetContador() {
        System.out.println("setContador");
        int contador = 0;
        Biblioteca instance = new Biblioteca();
        instance.setContador(contador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarListaLibros method, of class Biblioteca.
     */
    @Test
    public void testMostrarListaLibros() {
        System.out.println("mostrarListaLibros");
        Biblioteca instance = new Biblioteca();
        ArrayList<Libro> expResult = null;
        ArrayList<Libro> result = instance.mostrarListaLibros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLibro method, of class Biblioteca.
     */
    @Test
    public void testBuscarLibro() {
        System.out.println("buscarLibro");
        String titulo = "";
        String autor = "";
        Biblioteca instance = new Biblioteca();
        Libro expResult = null;
        Libro result = instance.buscarLibro(titulo, autor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLibro method, of class Biblioteca.
     */
    @Test
    public void testEliminarLibro_Libro() {
        System.out.println("eliminarLibro");
        Libro libro = null;
        Biblioteca instance = new Biblioteca();
        boolean expResult = false;
        boolean result = instance.eliminarLibro(libro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
