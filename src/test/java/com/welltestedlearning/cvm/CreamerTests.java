package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreamerTests {

    @Test
    public void milkCreamerIs25() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCreamer("milk");

        assertThat(coffeeOrder.price())
                .isEqualTo(25);
    }

    @Test
    public void halfNHalfCreamerIs35() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCreamer("half-n-half");

        assertThat(coffeeOrder.price())
                .isEqualTo(35);
    }

    @Test
    public void noneCreamerIs0() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCreamer("");

        assertThat(coffeeOrder.price())
                .isZero();
    }

    @Test
    public void milkDisplayIsCreamerMilk() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCreamer("milk");

        assertThat(coffeeOrder.display())
                .isEqualTo("Creamer: Milk\nPrice: 25\n");
    }

    @Test
    public void halfNHalfDisplayIsCreamerHalfNHalf() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCreamer("half-n-half");

        assertThat(coffeeOrder.display())
                .isEqualTo("Creamer: Half-N-Half\nPrice: 35\n");
    }

}
