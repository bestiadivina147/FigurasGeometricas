package edu.badpals.figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectanguloTest {
    @Test
    public void testArea() {
        Rectangulo rectangulo = new Rectangulo(4, 5);
        rectangulo.area();
        assertEquals(20, rectangulo.area(),0.01);
    }
}
