package com.welltestedlearning.cvm;

class CoffeeOrder {
    private CoffeeOrder() {
    }

    static CoffeeOrder getInstance() {
        return new CoffeeOrder();
    }

    void coffeeSize(String size) {

        if (size.equals(""))
            System.out.println("No coffee size selected");
        else if (!size.equals("small") && !size.equals("medium") && !size.equals("large"))
            System.out.println("No such coffee size as " + size);

        switch (size) {
            case "small": _price += 100; break;
            case "medium": _price += 150; break;
            case "large": _price += 200; break;
            case "": _price += 0;
        }
    }

    void creamer(String creamer) {
        if (creamer.equals(""))
            System.out.println("No creamer size selected");
        else if (!creamer.equals("milk") && !creamer.equals("half-n-half"))
            System.out.println("No such coffee size as " + creamer);

        switch (creamer) {
            case "milk": _price += 25; break;
            case "half-n-half": _price += 35; break;
            default: _price += 0;
        }
    }

    int price() {
        return _price;
    }

    private int _price = 0;
}
