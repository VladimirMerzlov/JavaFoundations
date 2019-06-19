package oop.wrapper;

public class AreaOfCircle {
    private double R = 0;
    public static final double MY_PI = 3.14;

    public AreaOfCircle(double R) {
        this.R = R;
    }

    public void printAreaOfCircle() {
        System.out.println("Площадь круга радиусом R=" + R + " равна S=" + MY_PI * R * R + " кв.ед.");
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }
}
