package edu.badpals.figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CirculoTest {
    @Test
    public void areaTest(){
        Circulo circulo = new Circulo("circulo",3);
        circulo.area();
        assertEquals(28.27, circulo.area(),0.01);
    }
}
