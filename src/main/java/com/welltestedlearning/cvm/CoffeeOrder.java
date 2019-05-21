package com.welltestedlearning.cvm;

import java.util.ArrayList;
import java.util.List;

class CoffeeOrder {

    private List<CoffeeItem> coffeeItems = new ArrayList<>();

    public void addCoffee(String size) {
        coffeeItems.add(new Size(size));
    }

    public void addCreamer(String creamer) {
        coffeeItems.add(new Creamer(creamer));
    }

    public void addSweetener(String sweetener) {
        coffeeItems.add(new Sweetener(sweetener));
    }

    public int price() {
        int coffeePrice = 0;
        for (CoffeeItem coffeeItem : coffeeItems) {
            coffeePrice += coffeeItem.price();
        }
        return coffeePrice;
    }

    public String display() {
        String displayString = "";
        for (CoffeeItem coffeeItem : coffeeItems) {
            displayString += coffeeItem.display() + "\n";
        }

        displayString += "Price: " + priceString() + "\n";

        return displayString;
    }

    private String priceString() {
        int total = price();
        int dollars = total / 100;
        int cents = total % 100;
        String strCents = String.valueOf(cents);

        if (cents == 0) {
            strCents += "0";
        } else if (cents <= 9) {
            strCents = "0" + strCents;
        }

        return "$" + dollars + "." + strCents;
    }
}
