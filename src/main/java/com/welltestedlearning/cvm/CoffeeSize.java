package com.welltestedlearning.cvm;

public class CoffeeSize {

    private String coffeeSize;
    private int price = 0;

    public CoffeeSize(String size) {
        this.coffeeSize = size;
    }

    public int price() {

        if (coffeeSize.isEmpty()) {
            System.out.println("No coffee coffeeSize selected");
        } else if (!coffeeSize.equals("small") && !coffeeSize.equals("medium") && !coffeeSize.equals("large")) {
            System.out.println("No such coffee coffeeSize as " + coffeeSize);
        }

        switch (coffeeSize) {
            case "small":
                price += 100;
                break;
            case "medium":
                price += 150;
                break;
            case "large":
                price += 200;
                break;
            default:
                break;
        }

        return price;
    }
}
