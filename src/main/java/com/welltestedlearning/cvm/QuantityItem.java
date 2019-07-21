package com.welltestedlearning.cvm;

public abstract class QuantityItem implements CoffeeItem {
    private int quantity;

    public QuantityItem(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int price() {
        return basePrice() * quantity;
    }

    protected abstract int basePrice();
}
