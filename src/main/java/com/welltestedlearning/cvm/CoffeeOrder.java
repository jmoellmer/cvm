package com.welltestedlearning.cvm;

class CoffeeOrder {

    private int price = 0;

    public void coffeeSize(String size) {
        CoffeeSize coffeeSize = new CoffeeSize(size);
        price += coffeeSize.price();
    }

    public void creamer(String creamer) {

        if (creamer.isEmpty()) {
            System.out.println("No creamer coffeeSize selected");
        } else if (!creamer.equals("milk") && !creamer.equals("half-n-half")) {
            System.out.println("No such coffee coffeeSize as " + creamer);
        }

        switch (creamer) {
            case "milk":
                price += 25;
                break;
            case "half-n-half":
                price += 35;
                break;
            default:
                break;
        }
    }

    public int price() {
        return price;
    }
}
