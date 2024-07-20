package com.italianfood;

public class Pizza extends ItalianDish {
    private String crustType;

    public Pizza(String name, double price, boolean isVegetarian, String crustType) {
        super(name, price, isVegetarian);
        this.crustType = crustType;
    }

    public String getCrustType() {
        return crustType;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + crustType + " crust and adding toppings.");
    }
}
