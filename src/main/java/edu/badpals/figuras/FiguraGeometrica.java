package edu.badpals.figuras;

public abstract class FiguraGeometrica {
    private String nombre;
    

    public FiguraGeometrica() {
        this.nombre = "desconocido";
    }

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
    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        salida.append("Figura:")
            .append(this.nombre)
            .append("\t")
            .append("Area: ")
            . append(this.area);
        return salida.toString();
    }
}
