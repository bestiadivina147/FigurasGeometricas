package edu.badpals.figuras;

public class Cuadrado extends FiguraGeometrica implements Drawable{
    
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }
    @Override
    public double area() {
        return this.lado*this.lado;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
    @Override
    public void draw() {
       System.out.println("Dibujo Cuadrado");
    }
    
}
