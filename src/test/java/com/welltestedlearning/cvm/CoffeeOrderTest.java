package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeOrderTest {

    @Test
    public void mediumCoffeeAndMilkCreamerIs175() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("medium");
        coffeeOrder.addCreamer("milk");

        assertThat(coffeeOrder.price())
                .isEqualTo(175);
    }

    @Test
    public void smallCoffeeAndHalfNHalfCreamerIs135() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("small");
        coffeeOrder.addCreamer("half-n-half");

        assertThat(coffeeOrder.price())
                .isEqualTo(135);
    }

    @Test
    public void largeCoffeeAndHalfNHalfIs235() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("large");
        coffeeOrder.addCreamer("half-n-half");

        assertThat(coffeeOrder.price())
                .isEqualTo(235);
    }

    @Test
    public void largeCoffeeAndHalfNHalfAndSugarIs245() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("large");
        coffeeOrder.addCreamer("half-n-half");
        coffeeOrder.addSweetener("sugar");

        assertThat(coffeeOrder.price())
                .isEqualTo(245);
    }

    @Test
    public void largeCoffeeAndHalfNHalfAndSplendaIs250() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("large");
        coffeeOrder.addCreamer("half-n-half");
        coffeeOrder.addSweetener("splenda");

        assertThat(coffeeOrder.price())
                .isEqualTo(250);
    }

    @Test
    public void fullDisplayTest() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("medium");
        coffeeOrder.addCreamer("milk");
        coffeeOrder.addSweetener("sugar");

        assertThat(coffeeOrder.display())
                .isEqualTo("Size: Medium\nCreamer: Milk\nSweetener: Sugar\nPrice: $1.85\n");
    }

}
