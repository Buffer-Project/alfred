package com.buffer.alfred.demo;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class DemoTests {

    @Test
    void testAnimales(){
        Perro bruno = new Perro();
        bruno.hacerRuido();

        Gato michi = new Gato();
        michi.hacerRuido();

        michi.setColor("negro");
        Assert.notNull(michi.getColor(), "el color no esta definido");
    }
}
