package com.welltestedlearning.cvm;

public class CoffeeVendingMachine {

    public static void main(String[] args) {

        CoffeeOrder coffeeOrder1 = new CoffeeOrder();
        coffeeOrder1.coffeeSize(SizeOption.MEDIUM);
        coffeeOrder1.creamer(CreamerOption.MILK);
        coffeeOrder1.sweetener(SweetnerOption.SUGAR);
        System.out.println(coffeeOrder1.display());

        CoffeeOrder coffeeOrder2 = new CoffeeOrder();
        coffeeOrder2.coffeeSize(SizeOption.XL);
        coffeeOrder2.creamer(CreamerOption.MILK);
        System.out.println(coffeeOrder2.display());

        CoffeeOrder coffeeOrder3 = new CoffeeOrder();
        coffeeOrder3.coffeeSize(SizeOption.LARGE);
        coffeeOrder3.sweetener(SweetnerOption.SUGAR);
        System.out.println(coffeeOrder3.display());

    }

}
