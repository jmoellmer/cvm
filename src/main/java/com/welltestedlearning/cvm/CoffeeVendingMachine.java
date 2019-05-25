package com.welltestedlearning.cvm;

public class CoffeeVendingMachine {

    public static void main(String[] args) {

        CoffeeOrder coffeeOrder1 = new CoffeeOrder();
        coffeeOrder1.coffeeSize("medium");
        coffeeOrder1.creamer("milk");
        coffeeOrder1.sweetener("sugar");
        System.out.println(coffeeOrder1.display());

        CoffeeOrder coffeeOrder2 = new CoffeeOrder();
        coffeeOrder2.coffeeSize("xl");
        coffeeOrder2.creamer("milk");
        System.out.println(coffeeOrder2.display());

        CoffeeOrder coffeeOrder3 = new CoffeeOrder();
        coffeeOrder3.coffeeSize("large");
        coffeeOrder3.sweetener("sugar");
        System.out.println(coffeeOrder3.display());

    }

}
