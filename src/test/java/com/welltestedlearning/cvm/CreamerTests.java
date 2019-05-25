package com.welltestedlearning.cvm;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreamerTests {

    @Test
    public void milkCreamerIs25() throws Exception {
        Creamer creamer = new Creamer("milk");

        assertThat(creamer.price())
                .isEqualTo(25);
    }

    @Test
    public void halfNHalfCreamerIs35() throws Exception {
        Creamer creamer = new Creamer("half-n-half");

        assertThat(creamer.price())
                .isEqualTo(35);
    }

    @Test
    public void noneCreamerIs0() throws Exception {
        Creamer creamer = new Creamer("");

        assertThat(creamer.price())
                .isZero();
    }

    @Test
    public void milkDisplayIsCreamerMilk() throws Exception {
        Creamer creamer = new Creamer("milk");

        assertThat(creamer.display())
                .isEqualTo("Creamer: Milk");
    }

    @Test
    public void halfNHalfDisplayIsCreamerHalfNHalf() throws Exception {
        Creamer creamer = new Creamer("half-n-half");

        assertThat(creamer.display())
                .isEqualTo("Creamer: Half-N-Half");
    }

}
