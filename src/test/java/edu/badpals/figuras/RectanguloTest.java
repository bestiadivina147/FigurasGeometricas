package edu.badpals.figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectanguloTest {
    @Test
    void testCalcularArea() {
        Rectangulo rectangulo = new Rectangulo(4, 5);
        rectangulo.calcularArea();
        assertEquals(20, rectangulo.area);
    }

    @Test
    void testConstructor() {
        Rectangulo rectangulo = new Rectangulo("Rectangulo",4, 5);
        assertEquals("Rectangulo", rectangulo.nombre);
    }

    @Test
    void testConstructorSinNombre() {
        Rectangulo rectangulo = new Rectangulo(4, 5);
        assertEquals("alguna figura", rectangulo.nombre);
        rectangulo.calcularArea();
        assertEquals(20, rectangulo.area);
    }

    @Test
    void testConstructorVacio() {
        Rectangulo rectangulo = new Rectangulo();
        assertEquals("alguna figura", rectangulo.nombre);
        assertEquals(0.0, rectangulo.area);
    }
}
