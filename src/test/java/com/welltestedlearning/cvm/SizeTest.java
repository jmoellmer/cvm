package com.welltestedlearning.cvm;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SizeTest {

    @Test
    public void smallCoffeeIs100() throws Exception {
        Size size = new Size(SizeOption.SMALL);

        assertThat(size.price())
                .isEqualTo(100);
    }
    
    @Test
    public void mediumCoffeeIs150() throws Exception {
        Size size = new Size(SizeOption.MEDIUM);

        assertThat(size.price())
                .isEqualTo(150);
    }

    @Test
    public void largeCoffeeIs200() throws Exception {
        Size size = new Size(SizeOption.LARGE);

        assertThat(size.price())
                .isEqualTo(200);
    }

    @Test
    public void xlCoffeeIs300() throws Exception {
        Size size = new Size(SizeOption.XL);

        assertThat(size.price())
                .isEqualTo(300);
    }

    @Test
    public void smallDisplayIsSizeSmall() throws Exception {
        Size size = new Size(SizeOption.SMALL);

        assertThat(size.display())
                .isEqualTo("Size: Small");
    }

    @Test
    public void xlDisplayIsSizeXL() throws Exception {
        Size size = new Size(SizeOption.XL);

        assertThat(size.display())
                .isEqualTo("Size: Xl");
    }

}
