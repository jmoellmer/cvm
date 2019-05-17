package com.welltestedlearning.cvm;

public class Creamer {

    private String creamer;

    public Creamer(String creamer) {
        this.creamer = creamer;
    }

    public int price() {
        int price = 0;

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

        return price;
    }

}
