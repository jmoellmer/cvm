package com.welltestedlearning.cvm;

public class Sweetener extends QuantityItem {

    private SweetnerOption sweetener;

    public Sweetener(SweetnerOption sweetener) {
        this(sweetener, 1);
    }

    public Sweetener(SweetnerOption sweetener, int quantity) {
        super(quantity);
        this.sweetener = sweetener;
    }

    @Override
    protected int basePrice() {

        int price = 0;

        switch (sweetener) {
            case SUGAR:
                price += 10;
                break;
            case SPLENDA:
                price += 15;
                break;
            default:
                break;
        }

        return  price;
    }

    @Override
    public String display() {

        String display = "";

        switch (sweetener) {
            case SUGAR:
                display = "Sugar";
                break;
            case SPLENDA:
                display = "Splenda";
                break;
            default:
                break;
        }

        return "Sweetener: " + display;
    }

}
