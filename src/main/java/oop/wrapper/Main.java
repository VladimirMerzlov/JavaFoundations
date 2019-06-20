package oop.wrapper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer n = new Integer(355);
        String s = n.toString();
        String s1 = "2347908";
        Integer n1 = Integer.parseInt(s1);

        Circle Circle = new Circle(5);
        Triangle Triangle = new Triangle(5, 6, 6, 8);
        Circle.printAreaOfCircle();
        Triangle.printAreaOfTriangle();
    }
}
