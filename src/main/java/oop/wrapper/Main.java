package oop.wrapper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double R1 = 0;
        double a1 = 0, b1 = 0, c1 = 0;
        Integer n = new Integer(355);
        String s = n.toString();
        String s1 = "2347908";
        Integer n1 = Integer.parseInt(s1);
        AreaOfCircle Circle = new AreaOfCircle(0);
        AreaOfTriangle Triangle = new AreaOfTriangle(0, 0, 0, 0);

        System.out.println("Введите данные,где R-радиоус окружности(описанной), a,b,c -  соответственно стороны треугольника");
        System.out.print("Введите  R = ");
        Scanner radius = new Scanner(System.in);
        if (radius.hasNextDouble()) {
            double Radius = radius.nextDouble();
            if (Radius >= 0) {
                R1 = Radius;
            } else {
                System.out.println("Некорректный ввод");
            }
        } else {
            System.out.println("Некорректный ввод");
        }

        System.out.print("Введите  a = ");
        Scanner aSide = new Scanner(System.in);

        if (aSide.hasNextDouble()) {
            double A = aSide.nextDouble();
            if (A >= 0) {
                a1 = A;
            } else {
                System.out.println("Некорректный ввод");
            }
        } else {
            System.out.println("Некорректный ввод");
        }

        System.out.print("Введите  b = ");
        Scanner bSide = new Scanner(System.in);
        if (bSide.hasNextDouble()) {
            double B = bSide.nextDouble();
            if (B >= 0) {
                b1 = B;
            } else {
                System.out.println("Некорректный ввод");
            }
        } else {
            System.out.println("Некорректный ввод");
        }

        System.out.print("Введите  c = ");
        Scanner cSide = new Scanner(System.in);
        if (cSide.hasNextDouble()) {
            double C = cSide.nextDouble();
            if (C >= 0) {
                c1 = C;
            } else {
                System.out.println("Некорректный ввод");
            }
        } else {
            System.out.println("Некорректный ввод");
        }

        System.out.println();
        Circle.setR(R1);
        Triangle.setR(R1);
        Triangle.setA(a1);
        Triangle.setB(b1);
        Triangle.setC(c1);
        Circle.printAreaOfCircle();
        Triangle.printAreaOfTriangle();
    }
}
