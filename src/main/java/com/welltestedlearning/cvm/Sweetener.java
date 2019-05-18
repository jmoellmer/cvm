package com.welltestedlearning.cvm;

public class Sweetener extends CoffeeItem {

    private String sweetener;

    public Sweetener(String sweetener) {
        this.sweetener = sweetener;
    }

    @Override
    public int price() {
        int price = 0;

        switch (sweetener) {
            case "sugar":
                price += 10;
                break;
            case "splenda":
                price += 15;
                break;
            default:
                break;
        }

        return price;
    }

}
