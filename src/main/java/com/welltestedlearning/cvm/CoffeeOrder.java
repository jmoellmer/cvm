package com.welltestedlearning.cvm;

class CoffeeOrder {

    private int price = 0;

    public void coffeeSize(String size) {

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
    }

    public void creamer(String creamer) {

        if (creamer.isEmpty()) {
            System.out.println("No creamer size selected");
        } else if (!creamer.equals("milk") && !creamer.equals("half-n-half")) {
            System.out.println("No such coffee size as " + creamer);
        }

        switch (creamer) {
            case "milk":
                price += 25;
                break;
            case "half-n-half":
                price += 35;
                break;
            default:
                break;
        }
    }

    public int price() {
        return price;
    }
}
