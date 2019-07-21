package com.welltestedlearning.cvm;

public class Sweetener extends QuantityItem implements CoffeeItem {

    private String sweetener;
    private int quantity;

    public Sweetener(String sweetener) {
        this(sweetener, 1);
    }

    public Sweetener(String sweetener, int quantity) {
        validateSweetener(sweetener);
        this.sweetener = sweetener;
        this.quantity = quantity;
    }

    private void validateSweetener(String sweetener) {
        if (sweetener.isEmpty() || sweetener.equals("none")) {
            System.out.println("No coffee sweetener selected");
        } else if (!sweetener.equals("sugar") && !sweetener.equals("splenda")) {
            System.out.println("No such coffee sweetener as " + sweetener);
        }
    }

    @Override
    public int basePrice() {

        int price = 0;

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

        return quantity * price;
    }

    @Override
    public String display() {

        String display = "";

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
