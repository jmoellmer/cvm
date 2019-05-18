package com.welltestedlearning.cvm;

import java.util.ArrayList;
import java.util.List;

class CoffeeOrder {

    List<CoffeeItem> coffeeItems = new ArrayList<>();

    public void addCoffee(String size) {
        coffeeItems.add(new Size(size));
    }

    public void addCreamer(String creamer) {
        coffeeItems.add(new Creamer(creamer));
    }

    public int price() {
        int coffeePrice = 0;
        for (CoffeeItem coffeeItem : coffeeItems) {
            coffeePrice += coffeeItem.price();
        }
        return coffeePrice;
    }
}
