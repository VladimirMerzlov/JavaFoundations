package oop.Object;

public class Main {
    public static void main(String[] args) {


        Pencil pencil1 = new Pencil(100, "blue", 0.5, "BIG");
        Pencil pencil2 = new Pencil(43.50, "red", 0.7, "КОНСТРУКТОР");
        Pencil pencil3 = new Pencil(100, "blue", 0.5, "BIG");
        Pencil pencil4 = new Pencil("red", "КОНСТРУКТОр");
        Pencil pencil5 = new Pencil("red", "КОНСТРУКТОР");

        System.out.println("Карандаши");
        System.out.println(pencil1);
        System.out.println(pencil2.toString());
        System.out.println(pencil3.toString());
        System.out.println(pencil4.toString());
        System.out.println(pencil5.toString());


        System.out.println("Сравнение карандашей");
        System.out.println("Карандаши Pencil1 и Pencil2 равны? " + pencil1.equals(pencil2));
        System.out.println("Карандаши Pencil1 и Pencil3 равны? " + pencil3.equals(pencil1));
        System.out.println("Карандаши Pencil2 и Pencil4 равны? " + pencil2.equals(pencil4));
        System.out.println("Карандаши Pencil2 и Pencil5 равны? " + pencil2.equals(pencil5));
        System.out.println("Карандаши Pencil4 и Pencil5 равны? " + pencil4.equals(pencil5));
    }
}
