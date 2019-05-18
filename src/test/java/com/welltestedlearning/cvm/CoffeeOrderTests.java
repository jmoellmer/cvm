package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeOrderTests {

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
}
