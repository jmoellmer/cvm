package com.welltestedlearning.cvm;

class CoffeeOrder {

    private int price = 0;

    public void coffeeSize(String size) {
        Size coffeeSize = new Size(size);
        price += coffeeSize.price();
    }

    public void creamer(String creamer) {
        Creamer coffeeCreamer = new Creamer(creamer);
        price += coffeeCreamer.price();
    }

    public int price() {
        return price;
    }
}
