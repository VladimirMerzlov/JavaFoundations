package oop.wrapper;

public class AreaOfTriangle {
    private double R = 0;
    private double a = 0, b = 0, c = 0;

    public AreaOfTriangle(double R, double a, double b, double c) {
        this.R = R;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printAreaOfTriangle() {
        System.out.println("Площадь треугольника со сторонами a=" + a + "  b=" + b + "  c=" + c + " и радиусом описаной окружности R=" + R + " равна S=" + (a * b * c) / 4 * R + " кв.ед.");
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
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
