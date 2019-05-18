package com.welltestedlearning.cvm;

class CoffeeOrder {

    private int totalPrice = 0;

    public void addCoffee(String size) {
        Size coffeeSize = new Size(size);
        totalPrice += coffeeSize.price();
    }

    public void addCreamer(String creamer) {
        Creamer coffeeCreamer = new Creamer(creamer);
        totalPrice += coffeeCreamer.price();
    }

    public int price() {
        return totalPrice;
    }
}
