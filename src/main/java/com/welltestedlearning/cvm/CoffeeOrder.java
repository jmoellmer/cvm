package com.welltestedlearning.cvm;

public class CoffeeOrder {
    private CoffeeOrder() {
    }

    public static CoffeeOrder getInstance() {
        return new CoffeeOrder();
    }

    public void coffeeSize(String size) {
        switch (size) {
            case "small": _price = 100; break;
            case "medium": _price = 150; break;
            default: _price = 0;
        }
    }

    public int price() {
        return _price;
    }

    private int _price = 0;
}
