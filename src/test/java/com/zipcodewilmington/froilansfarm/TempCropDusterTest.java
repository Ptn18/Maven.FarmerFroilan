package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TempCropDusterTest {

    @Test
    public void constructorTest() {
        Vehicle testPlane = new Cropduster();
        Assert.assertNotNull(testPlane);
    }

    @Test
    public void makeNoiseTest() {
        //Given
        Vehicle testPlane = new Cropduster();
        String expected = "Putter putter rattle woosh";

        //When
        String actual = testPlane.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void operateTest() {
        //Given
        Farm farm = new Farm();
        farm.createContainer(FarmItems.CROPROW);
        FarmFactory.plantField(farm);
        Cropduster cropduster = new Cropduster();

        //When
        Integer expected = 50;
        List<Crop> results = cropduster.operate(farm);
        Integer actual = results.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
