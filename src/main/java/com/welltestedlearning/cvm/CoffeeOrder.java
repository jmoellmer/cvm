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
}
