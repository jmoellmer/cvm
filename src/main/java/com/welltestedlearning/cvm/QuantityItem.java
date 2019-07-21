package com.welltestedlearning.cvm;

public abstract class QuantityItem implements CoffeeItem {
    private int quantity;

    public QuantityItem(int quantity) {
        this.quantity = quantity;
    }

    public int price() {
        return basePrice() * quantity;
    }

    public abstract int basePrice();
}
