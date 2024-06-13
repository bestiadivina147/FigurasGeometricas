package edu.badpals.figuras;

public class Elipse extends FiguraGeometrica implements Drawable {

    public double radioA = 0.0;
    public double radioB = 0.0;

    public Elipse() {
        super();
    }

    public Elipse(double radioA, double radioB) {
        super();
        this.radioA = radioA;
        this.radioB = radioB;
    }
    @Override
    public double area() {
        return Math.PI * this.radioA * this.radioB;
    }

    @Override
    public void draw() {
       System.out.println("Dibujo elipse")
    }
    
}
