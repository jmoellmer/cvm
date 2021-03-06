package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeOrderTest {

    @Test
    public void mediumCoffeeAndMilkCreamerIs175() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize(SizeOption.MEDIUM);
        coffeeOrder.creamer(CreamerOption.MILK);

        assertThat(coffeeOrder.price())
                .isEqualTo(175);
    }

    @Test
    public void smallCoffeeAndHalfNHalfCreamerIs135() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize(SizeOption.SMALL);
        coffeeOrder.creamer(CreamerOption.HALF_N_HALF);

        assertThat(coffeeOrder.price())
                .isEqualTo(135);
    }

    @Test
    public void largeCoffeeAndHalfNHalfIs235() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize(SizeOption.LARGE);
        coffeeOrder.creamer(CreamerOption.HALF_N_HALF);

        assertThat(coffeeOrder.price())
                .isEqualTo(235);
    }

    @Test
    public void largeCoffeeAndHalfNHalfAndSugarIs245() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize(SizeOption.LARGE);
        coffeeOrder.creamer(CreamerOption.HALF_N_HALF);
        coffeeOrder.sweetener(SweetnerOption.SUGAR);

        assertThat(coffeeOrder.price())
                .isEqualTo(245);
    }

    @Test
    public void largeCoffeeAndHalfNHalfAndSplendaIs250() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize(SizeOption.LARGE);
        coffeeOrder.creamer(CreamerOption.HALF_N_HALF);
        coffeeOrder.sweetener(SweetnerOption.SPLENDA);

        assertThat(coffeeOrder.price())
                .isEqualTo(250);
    }

    @Test
    public void fullDisplayTest() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize(SizeOption.MEDIUM);
        coffeeOrder.creamer(CreamerOption.MILK);
        coffeeOrder.sweetener(SweetnerOption.SUGAR);

        assertThat(coffeeOrder.display())
                .isEqualTo("Size: Medium\nCreamer: Milk\nSweetener: Sugar\nPrice: $1.85\n");
    }
    
    @Test
    public void smallCoffeeTwoMilksAndThreeSugarsCostIs180() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.coffeeSize(SizeOption.SMALL);
        coffeeOrder.creamer(CreamerOption.MILK, 2);
        coffeeOrder.sweetener(SweetnerOption.SUGAR, 3);

        assertThat(coffeeOrder.price())
            .isEqualTo(180);
    }
    

}
