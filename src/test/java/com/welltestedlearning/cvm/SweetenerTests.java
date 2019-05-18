package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SweetenerTests {

    @Test
    public void noneSweetenerIs0() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addSweetener("none");

        assertThat(coffeeOrder.price())
                .isZero();
    }
    
    @Test
    public void sugarSweetenerIs10() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addSweetener("sugar");

        assertThat(coffeeOrder.price())
                .isEqualTo(10);
    }
    
    @Test
    public void splendaSweetenerIs15() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addSweetener("splenda");

        assertThat(coffeeOrder.price())
                .isEqualTo(15);
    }

}
