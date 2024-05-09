package edu.badpals.figuras;

public class Cuadrado extends FiguraGeometrica {
    
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
    
}
