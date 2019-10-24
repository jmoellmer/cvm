package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreamerTest {

    @Test
    public void milkCreamerIs25() throws Exception {
        Creamer creamer = new Creamer(CreamerOption.MILK);

        assertThat(creamer.price())
                .isEqualTo(25);
    }

    @Test
    public void halfNHalfCreamerIs35() throws Exception {
        Creamer creamer = new Creamer(CreamerOption.HALF_N_HALF);

        assertThat(creamer.price())
                .isEqualTo(35);
    }

    @Test
    public void noneCreamerIs0() throws Exception {
        Creamer creamer = new Creamer(CreamerOption.NONE);

        assertThat(creamer.price())
                .isZero();
    }

    @Test
    public void milkDisplayIsCreamerMilk() throws Exception {
        Creamer creamer = new Creamer(CreamerOption.MILK);

        assertThat(creamer.display())
                .isEqualTo("Creamer: Milk");
    }

    @Test
    public void halfNHalfDisplayIsCreamerHalfNHalf() throws Exception {
        Creamer creamer = new Creamer(CreamerOption.HALF_N_HALF);

        assertThat(creamer.display())
                .isEqualTo("Creamer: Half & Half");
    }

    @Test
    public void twoMilksCostIs50() throws Exception {
        Creamer creamer = new Creamer(CreamerOption.MILK, 2);

        assertThat(creamer.price())
            .isEqualTo(50);
    }
    

}
