package io_strems.abstract_class;

public abstract class Club {
   private String name;
    private double price;

    public Club(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public abstract boolean isManchesterUnited();
}
