package com.welltestedlearning.cvm;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeOrderTest {

    private CoffeeOrder coffeeOrder;

    @Before
    public void setUp() {
        coffeeOrder = CoffeeOrder.getInstance();
    }

    @Test
    public void smallCoffeeIs100() throws Exception {
        coffeeOrder.coffeeSize("small");
        assertThat(coffeeOrder.price()).isEqualTo(100);
    }
    
    @Test
    public void mediumCoffeeIs150() throws Exception {
        coffeeOrder.coffeeSize("medium");
        assertThat(coffeeOrder.price()).isEqualTo(150);
    }

    @Test
    public void largeCoffeeIs200() throws Exception {
        coffeeOrder.coffeeSize("large");
        assertThat(coffeeOrder.price()).isEqualTo(200);
    }

    @Test
    public void emptyCoffeeIs0() throws Exception {
        coffeeOrder.coffeeSize("");
        assertThat(coffeeOrder.price()).isEqualTo(0);
    }

    @Test
    public void milkCreamerIs25() throws Exception {
        coffeeOrder.creamer("milk");
        assertThat(coffeeOrder.price()).isEqualTo(25);
    }

    @Test
    public void halfNHalfCreamerIs35() throws Exception {
        coffeeOrder.creamer("half-n-half");
        assertThat(coffeeOrder.price()).isEqualTo(35);
    }

    @Test
    public void noneCreamerIs0() throws Exception {
        coffeeOrder.creamer("");
        assertThat(coffeeOrder.price()).isEqualTo(0);
    }
    
    @Test
    public void mediumCoffeeAndMilkCreamerIs175() throws Exception {
        coffeeOrder.coffeeSize("medium");
        coffeeOrder.creamer("milk");
        assertThat(coffeeOrder.price()).isEqualTo(175);
    }
    


}
