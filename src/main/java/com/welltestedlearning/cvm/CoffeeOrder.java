package com.welltestedlearning.cvm;

class CoffeeOrder {
    private CoffeeOrder() {
    }

    static CoffeeOrder getInstance() {
        return new CoffeeOrder();
    }

    void coffeeSize(String size) {
        switch (size) {
            case "small": _price += 100; break;
            case "medium": _price += 150; break;
            case "large": _price = 200; break;
            default: _price = 0;
        }
    }

    void creamer(String creamer) {
        switch (creamer) {
            case "milk": _price += 25; break;
            case "half-n-half": _price += 35; break;
            default: _price = 0;
        }
    }

    int price() {
        return _price;
    }

    private int _price = 0;
}
