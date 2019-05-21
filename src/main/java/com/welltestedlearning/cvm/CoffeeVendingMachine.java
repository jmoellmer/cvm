package com.welltestedlearning.cvm;

public class CoffeeVendingMachine {

    public static void main(String[] args) {

        CoffeeOrder coffeeOrder1 = new CoffeeOrder();

        coffeeOrder1.addCoffee("medium");
        coffeeOrder1.addCreamer("milk");
        coffeeOrder1.addSweetener("sugar");

        System.out.println(coffeeOrder1.display());

        CoffeeOrder coffeeOrder2 = new CoffeeOrder();

        coffeeOrder2.addCoffee("xl");
        coffeeOrder2.addCreamer("milk");

        System.out.println(coffeeOrder2.display());

        CoffeeOrder coffeeOrder3 = new CoffeeOrder();

        coffeeOrder3.addCoffee("large");
        coffeeOrder3.addSweetener("sugar");

        System.out.println(coffeeOrder3.display());



    }

}
