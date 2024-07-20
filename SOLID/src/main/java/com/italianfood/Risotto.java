package com.italianfood;

public class Risotto extends ItalianDish {
    private String riceType;

    public Risotto(String name, double price, boolean isVegetarian, String riceType) {
        super(name, price, isVegetarian);
        this.riceType = riceType;
    }

    public String getRiceType() {
        return riceType;
    }

    @Override
    public void prepare() {
        System.out.println("Cooking " + riceType + " rice with broth and ingredients.");
    }
}
