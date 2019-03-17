package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.*;
import org.junit.Assert;
import org.junit.Test;

public class EdibleFactoryTest {


    @Test
    public void createEarCornTest() {
        //When
        Edible actual = EdibleFactory.create(Crop.Type.CORNSTALK);
        //Then
        Assert.assertTrue(actual instanceof EarCorn);
    }

    @Test
    public void createPotatoTest() {
        Crop crop = new Crop(Crop.Type.POTATO_PLANT);
        //When
        Edible actual = EdibleFactory.create(Crop.Type.POTATO_PLANT);
        //Then
        Assert.assertTrue(actual instanceof Potato);
    }

    @Test
    public void yieldTomatoTest() {
        Edible actual = EdibleFactory.create(Crop.Type.TOMATO_PLANT);
        Assert.assertTrue(actual instanceof Tomato);
    }

}