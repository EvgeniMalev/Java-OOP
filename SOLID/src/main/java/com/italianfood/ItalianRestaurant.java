package com.italianfood;

public class ItalianRestaurant {
    public static void serveDish(ItalianDish dish) {
        System.out.println("Serving: " + dish.getName());
        System.out.println("Price: $" + dish.getPrice());
        System.out.println("Is vegetarian: " + dish.isVegetarian());
        dish.prepare();
    }

    public static void main(String[] args) {
        ItalianDish pasta = new Pasta("Spaghetti Bolognese", 12.99, false, "Bolognese");
        ItalianDish pizza = new Pizza("Margherita", 10.99, true, "Thin crust");
        ItalianDish risotto = new Risotto("Mushroom Risotto", 15.99, true, "Arborio");

        serveDish(pasta);
        System.out.println();
        serveDish(pizza);
        System.out.println();
        serveDish(risotto);
    }
}
