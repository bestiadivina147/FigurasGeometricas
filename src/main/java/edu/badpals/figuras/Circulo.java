package edu.badpals.figuras;

public class Circulo extends FiguraGeometrica {

    private double radio = 0d;

    private final double PI = Math.PI;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI*this.radio*this.radio;
    }

}
