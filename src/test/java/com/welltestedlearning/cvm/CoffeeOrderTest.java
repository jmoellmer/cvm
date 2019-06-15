package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeOrderTest {

    @Test
    public void mediumCoffeeAndMilkCreamerIs175() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("medium");
        coffeeOrder.creamer("milk");

        assertThat(coffeeOrder.price())
                .isEqualTo(175);
    }

    @Test
    public void smallCoffeeAndHalfNHalfCreamerIs135() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("small");
        coffeeOrder.creamer("half-n-half");

        assertThat(coffeeOrder.price())
                .isEqualTo(135);
    }

    @Test
    public void largeCoffeeAndHalfNHalfIs235() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("large");
        coffeeOrder.creamer("half-n-half");

        assertThat(coffeeOrder.price())
                .isEqualTo(235);
    }

    @Test
    public void largeCoffeeAndHalfNHalfAndSugarIs245() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("large");
        coffeeOrder.creamer("half-n-half");
        coffeeOrder.sweetener("sugar");

        assertThat(coffeeOrder.price())
                .isEqualTo(245);
    }

    @Test
    public void largeCoffeeAndHalfNHalfAndSplendaIs250() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("large");
        coffeeOrder.creamer("half-n-half");
        coffeeOrder.sweetener("splenda");

        assertThat(coffeeOrder.price())
                .isEqualTo(250);
    }

    @Test
    public void fullDisplayTest() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("medium");
        coffeeOrder.creamer("milk");
        coffeeOrder.sweetener("sugar");

        assertThat(coffeeOrder.display())
                .isEqualTo("Size: Medium\nCreamer: Milk\nSweetener: Sugar\nPrice: $1.85\n");
    }
    
    @Test
    public void smallCoffeeTwoMilksAndThreeSugarsCostIs180() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize("small");
        coffeeOrder.creamer("milk", 2);
        coffeeOrder.sweetener("sugar", 3);

        assertThat(coffeeOrder.price())
            .isEqualTo(180);
    }
    

}
