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
}
