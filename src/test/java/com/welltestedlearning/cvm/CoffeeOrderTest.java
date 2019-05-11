package com.welltestedlearning.cvm;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeOrderTest {

    private CoffeeOrder _coffeeOrder;

    @Before
    public void setUp() {
        _coffeeOrder = CoffeeOrder.getInstance();
    }

    @Test
    public void smallCoffeeIs100() throws Exception {
        _coffeeOrder.coffeeSize("small");
        assertThat(_coffeeOrder.price()).isEqualTo(100);
    }
    
    @Test
    public void mediumCoffeeIs150() throws Exception {
        _coffeeOrder.coffeeSize("medium");
        assertThat(_coffeeOrder.price()).isEqualTo(150);
    }

    @Test
    public void largeCoffeeIs200() throws Exception {
        _coffeeOrder.coffeeSize("large");
        assertThat(_coffeeOrder.price()).isEqualTo(200);
    }

    @Test
    public void emptyCoffeeIs0() throws Exception {
        _coffeeOrder.coffeeSize("");
        assertThat(_coffeeOrder.price()).isEqualTo(0);
    }


}
