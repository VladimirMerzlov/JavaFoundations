package oop.Object;

public class Pencil {
    private String color;
    private String width;
    private String name;

    public Pencil(String color, String width, String name) {
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

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
