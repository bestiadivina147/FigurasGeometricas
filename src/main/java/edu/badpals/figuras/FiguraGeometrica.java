package edu.badpals.figuras;

public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double area();
}
