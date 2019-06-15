package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SweetenerTest {

    @Test
    public void noneSweetenerIs0() throws Exception {
        Sweetener sweetener = new Sweetener("none");

        assertThat(sweetener.price())
                .isZero();
    }
    
    @Test
    public void sugarSweetenerIs10() throws Exception {
        Sweetener sweetener = new Sweetener("sugar");

        assertThat(sweetener.price())
                .isEqualTo(10);
    }

    @Test
    public void splendaSweetenerIs15() throws Exception {
        Sweetener sweetener = new Sweetener("splenda");

        assertThat(sweetener.price())
                .isEqualTo(15);
    }

    @Test
    public void sugarDisplayIsSweetenerSugar() throws Exception {
        Sweetener sweetener = new Sweetener("sugar");

        assertThat(sweetener.display())
                .isEqualTo("Sweetener: Sugar");
    }

    @Test
    public void splendaDisplayIsSweetenerSplenda() throws Exception {
        Sweetener sweetener = new Sweetener("splenda");

        assertThat(sweetener.display())
                .isEqualTo("Sweetener: Splenda");
    }

}
