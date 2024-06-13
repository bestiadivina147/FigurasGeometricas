package edu.badpals.figuras;

public class Rectangulo extends FiguraGeometrica implements Drawable {

    double base = 0.0;
    double altura = 0.0;

    public Rectangulo() {
        super();
    }

    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }

    @Override
    public void draw() {
        System.out.println("Dibujo Rectangulo");
    }

}
