package com.welltestedlearning.cvm;

public class Creamer extends CoffeeItem {

    private String creamer;

    public Creamer(String creamer) {

        if (creamer.isEmpty()) {
            System.out.println("No coffee creamer selected");
        } else if (!creamer.equals("milk") && !creamer.equals("half-n-half")) {
            System.out.println("No such coffee creamer as " + creamer);
        }

        this.creamer = creamer;
    }

    public int price() {
        int price = 0;

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

    @Override
    public String display() {
        switch (creamer) {
            case "milk":
                super.display = "Milk";
                break;
            case "half-n-half":
                super.display = "Half-N-Half";
                break;
            default:
                break;
        }

        return "Creamer: " + super.display;
    }

}
