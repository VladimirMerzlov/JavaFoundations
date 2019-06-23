package oop.Object;

public class Pencil {
    private double price;
    private String color;
    private double width;
    private String name;

    public Pencil(double price, String color, double width, String name) {
        this.price = price;
        this.color = color;
        this.width = width;
        this.name = name;
    }

    public Pencil(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }

        Pencil pencil = (Pencil) obj;
        if (price == pencil.price) {
            if (color.equals(pencil.color)) {
                if (width == pencil.width) {
                    if (name.equals(pencil.name)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Карандаш фирмы: " + name + ". Цвет : " + color + ", толщина : " + width + ". Цена : " + price;

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
