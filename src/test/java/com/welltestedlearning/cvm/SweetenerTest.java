package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SweetenerTest {

    @Test
    public void noneSweetenerIs0() throws Exception {
        Sweetener sweetener = new Sweetener(SweetnerOption.NONE);

        assertThat(sweetener.price())
                .isZero();
    }
    
    @Test
    public void sugarSweetenerIs10() throws Exception {
        Sweetener sweetener = new Sweetener(SweetnerOption.SUGAR);

        assertThat(sweetener.price())
                .isEqualTo(10);
    }

    @Test
    public void splendaSweetenerIs15() throws Exception {
        Sweetener sweetener = new Sweetener(SweetnerOption.SPLENDA);

        assertThat(sweetener.price())
                .isEqualTo(15);
    }

    @Test
    public void sugarDisplayIsSweetenerSugar() throws Exception {
        Sweetener sweetener = new Sweetener(SweetnerOption.SUGAR);

        assertThat(sweetener.display())
                .isEqualTo("Sweetener: Sugar");
    }

    @Test
    public void splendaDisplayIsSweetenerSplenda() throws Exception {
        Sweetener sweetener = new Sweetener(SweetnerOption.SPLENDA);

        assertThat(sweetener.display())
                .isEqualTo("Sweetener: Splenda");
    }
    
    @Test
    public void twoSugarsCostIs20() throws Exception {
        Sweetener sweetener = new Sweetener(SweetnerOption.SUGAR, 2);

        assertThat(sweetener.price())
            .isEqualTo(20);

    }
    

}
