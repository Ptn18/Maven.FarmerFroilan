package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TempCropDusterTest {

    @Test
    public void constructorTest() {
        Vehicle testTractor = new Tractor();
        Assert.assertNotNull(testTractor);
    }

    @Test
    public void makeNoiseTest() {
        //Given
        Vehicle testTractor = new Tractor();
        String expected = "Putter putter rattle woosh";

        //When
        String actual = testTractor.makeNoise();
    }

    @Test
    public void fertilizeTest1() {
        //Given
        CropRow testRow = new CropRow();
        Crop testCornStalk = new Crop(Crop.Type.CORNSTALK);
        testRow.store(testCornStalk);

        //When
        Cropduster testPlane = new Cropduster();
        testPlane.fertilize(testRow);

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
        testPlane.fertilize(testRow);

        //Then
        Assert.assertTrue(testCornStalk.hasBeenFertilized());
    }
}
