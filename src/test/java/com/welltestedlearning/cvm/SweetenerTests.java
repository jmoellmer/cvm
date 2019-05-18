package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SweetenerTests {

    @Test
    public void noneSweetnerIs0() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addSweetener("None");

        assertThat(coffeeOrder.price())
                .isZero();
    }
    
}
