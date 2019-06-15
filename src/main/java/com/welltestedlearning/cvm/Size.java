package com.welltestedlearning.cvm;

public class Size implements CoffeeItem {

    private String size;

    public Size(String size) {

        validateSize(size);

        this.size = size;
    }

    private void validateSize(String size) {
        if (size.isEmpty()) {
            System.out.println("No coffee size selected");
        } else if (!size.equals("small") && !size.equals("medium")
                && !size.equals("large") && !size.equals("xl")) {
            System.out.println("No such coffee size as " + size);
        }
    }

    @Override
    public int price() {

        int price = 0;

        switch (size) {
            case "small":
                price += 100;
                break;
            case "medium":
                price += 150;
                break;
            case "large":
                price += 200;
                break;
            case "xl":
                price += 300;
                break;
            default:
                break;
        }

        return price;
    }

    @Override
    public String display() {

        String display = "";

        switch (size) {
            case "small":
                display = "Small";
                break;
            case "medium":
                display = "Medium";
                break;
            case "large":
                display = "Large";
                break;
            case "xl":
                display = "XL";
                break;
            default:
                break;
        }

        return "Size: " + display;
    }
}
