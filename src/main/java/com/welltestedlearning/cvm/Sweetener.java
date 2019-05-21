package com.welltestedlearning.cvm;

public class Sweetener extends CoffeeItem {

    private String sweetener;

    public Sweetener(String sweetener) {
        if (sweetener.isEmpty() || sweetener.equals("none")) {
            System.out.println("No coffee sweetener selected");
        } else if (!sweetener.equals("sugar") && !sweetener.equals("splenda")) {
            System.out.println("No such coffee sweetener as " + sweetener);
        }
        this.sweetener = sweetener;
    }

    @Override
    public int price() {

        switch (sweetener) {
            case "sugar":
                price += 10;
                break;
            case "splenda":
                price += 15;
                break;
            default:
                break;
        }

        return price;
    }

    @Override
    public String display() {

        switch (sweetener) {
            case "sugar":
                display = "Sugar";
                break;
            case "splenda":
                display = "Splenda";
                break;
            default:
                break;
        }

        return "Sweetener: " + display;
    }

}
