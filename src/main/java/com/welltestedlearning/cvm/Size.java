package com.welltestedlearning.cvm;

public class Size extends CoffeeItem {

    private String size;

    public Size(String size) {

        if (size.isEmpty()) {
            System.out.println("No coffee size selected");
        } else if (!size.equals("small") && !size.equals("medium") && !size.equals("large")) {
            System.out.println("No such coffee size as " + size);
        }

        this.size = size;
    }

    @Override
    public int price() {

        switch (size) {
            case "small":
                super.price += 100;
                break;
            case "medium":
                super.price += 150;
                break;
            case "large":
                super.price += 200;
                break;
            case "xl":
                super.price += 300;
                break;
            default:
                break;
        }

        return super.price;
    }

    @Override
    public String display() {
        switch (size) {
            case "small":
                super.display = "Small";
                break;
            case "medium":
                super.display = "Medium";
                break;
            case "large":
                super.display = "Large";
                break;
            case "xl":
                super.display = "XL";
                break;
            default:
                break;
        }

        return "Size: " + super.display;
    }
}
