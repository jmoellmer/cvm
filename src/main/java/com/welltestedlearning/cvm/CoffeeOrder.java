package com.welltestedlearning.cvm;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class CoffeeOrder {

    private List<CoffeeItem> coffeeItems = new ArrayList<>();

    public void coffeeSize(SizeOption size) {
        coffeeItems.add(new Size(size));
    }

    public void creamer(CreamerOption creamer) {
        coffeeItems.add(new Creamer(creamer));
    }

    public void creamer(CreamerOption creamer, int quantity) {
        coffeeItems.add(new Creamer(creamer, quantity));
    }

    public void sweetener(String sweetener) {
        coffeeItems.add(new Sweetener(sweetener));
    }

    public void sweetener(String sweetener, int quantity) {
        coffeeItems.add(new Sweetener(sweetener, quantity));
    }

    public int price() {
        int coffeePrice = 0;
        for (CoffeeItem coffeeItem : coffeeItems) {
            coffeePrice += coffeeItem.price();
        }
        return coffeePrice;
    }

    public String display() {
        StringBuilder displayString = new StringBuilder();
        for (CoffeeItem coffeeItem : coffeeItems) {
            displayString
                    .append(coffeeItem.display())
                    .append('\n');
        }

        displayString.append("Price: ")
                .append(priceString())
                .append('\n');

        return displayString.toString();
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
