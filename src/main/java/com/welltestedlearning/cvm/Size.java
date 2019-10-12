package com.welltestedlearning.cvm;

public class Size implements CoffeeItem {

    private SizeOption size;

    public Size(SizeOption size) {
        this.size = size;
    }

    @Override
    public int price() {

        int price = 0;

        switch (size) {
            case SMALL:
                price += 100;
                break;
            case MEDIUM:
                price += 150;
                break;
            case LARGE:
                price += 200;
                break;
            case XL:
                price += 300;
                break;
            default:
                break;
        }

        return price;
    }

    @Override
    public String display() {
        return "Size: " + size.toString();
    }
}
