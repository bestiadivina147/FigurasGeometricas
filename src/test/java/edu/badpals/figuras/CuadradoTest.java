package edu.badpals.figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CuadradoTest {
    @Test
    public void areaTest(){
        Cuadrado cuadrado = new Cuadrado("cuadrado",3);
        cuadrado.area();
        assertEquals(9.00, cuadrado.area(),0.01);
    }
}
