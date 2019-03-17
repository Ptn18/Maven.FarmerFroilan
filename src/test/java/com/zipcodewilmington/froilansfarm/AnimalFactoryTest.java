package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

public class AnimalFactoryTest {
    
    @Test
    public void createFactoryTest() {
        AnimalFactory result = AnimalFactory.createFactory(AnimalFactory.AnimalType.FARMER);
        Assert.assertTrue(result instanceof AnimalFactory);
    }
}