package oop.wrapper;

public class Circle {
    private double r;
    public static final double MY_PI = 3.14;

    public Circle(double r) {

        this.r = r;
    }

    public void printAreaOfCircle() {
        System.out.println("Площадь круга радиусом R=" + r + " равна S=" + MY_PI * r * r + " кв.ед.");
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
