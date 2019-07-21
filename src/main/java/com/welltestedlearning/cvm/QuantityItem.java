package com.welltestedlearning.cvm;

public abstract class QuantityItem implements CoffeeItem {
    protected int quantity = 1;

    public int price() {
        return basePrice() * quantity;
    }

    public abstract int basePrice();
}
