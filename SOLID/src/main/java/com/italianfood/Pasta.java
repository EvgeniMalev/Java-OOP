package com.italianfood;

public class Pasta extends ItalianDish {
    private String sauceType;

    public Pasta(String name, double price, boolean isVegetarian, String sauceType) {
        super(name, price, isVegetarian);
        this.sauceType = sauceType;
    }

    public String getSauceType() {
        return sauceType;
    }

    @Override
    public void prepare() {
        System.out.println("Boiling pasta and adding " + sauceType + " sauce.");
    }
}
