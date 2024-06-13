package edu.badpals.figuras;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElipseTest {
    @Test
    public void testCalcularArea() {
        Elipse elipse = new Elipse(3, 4);
        elipse.area();
        assertEquals(37.7, elipse.area(), 0.01);
    }
}
