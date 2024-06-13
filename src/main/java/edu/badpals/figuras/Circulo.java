package edu.badpals.figuras;

public class Circulo extends FiguraGeometrica implements Drawable {

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

    @Override
    public void draw() {
        System.out.println("Dibujo círculo");
    }

}
