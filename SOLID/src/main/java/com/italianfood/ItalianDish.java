package com.italianfood;

public abstract class ItalianDish {
    private String name;
    private double price;
    private boolean isVegetarian;

    public ItalianDish(String name, double price, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public abstract void prepare();
}
