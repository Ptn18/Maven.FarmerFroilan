package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

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
    }

    @Test
    public void fertilizeTest1() {
        //Given
        CropRow testRow = new CropRow();
        Crop testCornStalk = new Crop(Crop.Type.CORNSTALK);
        testRow.store(testCornStalk);

        //When
        Cropduster testPlane = new Cropduster();
        testPlane.fertilize(testCornStalk);

        //Then
        Assert.assertTrue(testCornStalk.hasBeenFertilized());
    }

    @Test
    public void fertilizeTest2() {
        //Given
        CropRow testRow = new CropRow();
        Crop testCornStalk = new Crop(Crop.Type.CORNSTALK);
        testRow.store(testCornStalk);
        testCornStalk.fertilized();

        //When
        Cropduster testPlane = new Cropduster();
        testPlane.fertilize(testCornStalk);

        //Then
        Assert.assertTrue(testCornStalk.hasBeenFertilized());
    }
}
