package com.welltestedlearning.cvm;

public class Size {

    private String size;

    public Size(String size) {
        this.size = size;
    }

    public int price() {

        int price = 0;

        if (size.isEmpty()) {
            System.out.println("No coffee size selected");
        } else if (!size.equals("small") && !size.equals("medium") && !size.equals("large")) {
            System.out.println("No such coffee size as " + size);
        }

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
            default:
                break;
        }

        return price;
    }
}
