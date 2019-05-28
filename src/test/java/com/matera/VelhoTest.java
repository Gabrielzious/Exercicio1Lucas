
package com.matera;

import org.junit.Assert;
import org.junit.Test;

public class VelhoTest {

    @Test
    public void testValorReduzidoDoVelho() {
        Imovel velho = new Velho("rua whatever", 10_000);

        Assert.assertEquals(10_000, velho.getPreco());

    }

}