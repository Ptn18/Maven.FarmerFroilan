package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class AnimalFactoryTest {
    
    @Test
    public void createFactoryTest() {
        AnimalFactory result = AnimalFactory.createFactory(AnimalFactory.AnimalType.FARMER);
        Assert.assertTrue(result instanceof AnimalFactory);
    }
}