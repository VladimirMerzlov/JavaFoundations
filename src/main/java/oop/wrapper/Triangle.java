package oop.wrapper;

public class Triangle {
    private double r;
    private double a, b, c;

    public Triangle(double r, double a, double b, double c) {
        this.r = r;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printAreaOfTriangle() {
        System.out.println("Площадь треугольника со сторонами a=" + a + "  b=" + b + "  c=" + c + " и радиусом описаной окружности R=" + r + " равна S=" + (a * b * c) / 4 * r + " кв.ед.");
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
