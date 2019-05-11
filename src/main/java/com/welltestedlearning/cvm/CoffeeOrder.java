package com.welltestedlearning.cvm;

class CoffeeOrder {
    private CoffeeOrder() {
    }

    static CoffeeOrder getInstance() {
        return new CoffeeOrder();
    }

    void coffeeSize(String size) {

        if (size.equals(""))
            System.out.println("No coffee size selected");
        else if (!size.equals("small") && !size.equals("medium") && !size.equals("large"))
            System.out.println("No such coffee size as " + size);

        switch (size) {
            case "small": price += 100; break;
            case "medium": price += 150; break;
            case "large": price += 200; break;
            default: price += 0; break;
        }
    }

    void creamer(String creamer) {
        if (creamer.equals(""))
            System.out.println("No creamer size selected");
        else if (!creamer.equals("milk") && !creamer.equals("half-n-half"))
            System.out.println("No such coffee size as " + creamer);

        switch (creamer) {
            case "milk": price += 25; break;
            case "half-n-half": price += 35; break;
            default: price += 0; break;
        }
    }

    int price() {
        return price;
    }

    private int price = 0;
}
