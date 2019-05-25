package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SweetenerTest {

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

    @Test
    public void sugarDisplayIsSweetenerSugar() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addSweetener("sugar");

        assertThat(coffeeOrder.display())
                .isEqualTo("Sweetener: Sugar\nPrice: $0.10\n");
    }

    @Test
    public void splendaDisplayIsSweetenerSplenda() throws Exception {
        CoffeeOrder coffeeOrder = new CoffeeOrder();

        coffeeOrder.addSweetener("splenda");

        assertThat(coffeeOrder.display())
                .isEqualTo("Sweetener: Splenda\nPrice: $0.15\n");
    }

}
