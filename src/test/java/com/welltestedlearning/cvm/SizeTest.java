package com.welltestedlearning.cvm;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SizeTest {

    @Test
    public void smallCoffeeIs100() throws Exception {
        Size size = new Size("small");

        assertThat(size.price())
                .isEqualTo(100);
    }
    
    @Test
    public void mediumCoffeeIs150() throws Exception {
        Size size = new Size("medium");

        assertThat(size.price())
                .isEqualTo(150);
    }

    @Test
    public void largeCoffeeIs200() throws Exception {
        Size size = new Size("large");

        assertThat(size.price())
                .isEqualTo(200);
    }

    @Test
    public void xlCoffeeIs300() throws Exception {
        Size size = new Size("xl");

        assertThat(size.price())
                .isEqualTo(300);
    }

    @Test
    public void emptyCoffeeIs0() throws Exception {
        Size size = new Size("");

        assertThat(size.price())
                .isZero();
    }

    @Test
    public void smallDisplayIsSizeSmall() throws Exception {
        Size size = new Size("small");

        assertThat(size.display())
                .isEqualTo("Size: Small");
    }

    @Test
    public void xlDisplayIsSizeXL() throws Exception {
        Size size = new Size("xl");

        assertThat(size.display())
                .isEqualTo("Size: XL");
    }

}
