package com.welltestedlearning.cvm;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeOrderSizeTests {

    @Test
    public void smallCoffeeIs100() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("small");

        assertThat(coffeeOrder.price())
                .isEqualTo(100);
    }
    
    @Test
    public void mediumCoffeeIs150() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("medium");

        assertThat(coffeeOrder.price())
                .isEqualTo(150);
    }

    @Test
    public void largeCoffeeIs200() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("large");

        assertThat(coffeeOrder.price())
                .isEqualTo(200);
    }

    @Test
    public void emptyCoffeeIs0() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("");

        assertThat(coffeeOrder.price())
                .isZero();
    }

}
