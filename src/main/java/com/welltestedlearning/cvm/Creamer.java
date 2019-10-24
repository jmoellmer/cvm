package com.welltestedlearning.cvm;

public class Creamer extends QuantityItem {

    private CreamerOption creamer;

    public Creamer(CreamerOption creamer) {
        this(creamer, 1);
    }

    public Creamer(CreamerOption creamer, int quantity) {
        super(quantity);
        this.creamer = creamer;
    }

    @Override
    protected int basePrice() {

        int price = 0;

        switch (creamer) {
            case MILK:
                price += 25;
                break;
            case HALF_N_HALF:
                price += 35;
                break;
            default:
                break;
        }

        return price;
    }

    @Override
    public String display() {
        return "Creamer: " + creamer.toString();
    }

}
