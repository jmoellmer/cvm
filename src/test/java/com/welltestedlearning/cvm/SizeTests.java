package com.welltestedlearning.cvm;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SizeTests {

    @Test
    public void smallCoffeeIs100() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("small");

        assertThat(coffeeOrder.price())
                .isEqualTo(100);
    }
    
    @Test
    public void mediumCoffeeIs150() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("medium");

        assertThat(coffeeOrder.price())
                .isEqualTo(150);
    }

    @Test
    public void largeCoffeeIs200() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("large");

        assertThat(coffeeOrder.price())
                .isEqualTo(200);
    }

    @Test
    public void emptyCoffeeIs0() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addCoffee("");

        assertThat(coffeeOrder.price())
                .isZero();
    }

}
