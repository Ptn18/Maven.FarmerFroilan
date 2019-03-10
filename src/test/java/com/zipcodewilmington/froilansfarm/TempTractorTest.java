package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TempTractorTest {

    @Test
    public void constructorTest() {
        Vehicle testTractor = new Tractor();
        Assert.assertNotNull(testTractor);
    }

    @Test
    public void makeNoiseTest() {
        //Given
        Vehicle testTractor = new Tractor();
        String expected = "Vroom rattle chug chug";

        //When
        String actual = testTractor.makeNoise();
    }

    @Test
    public void harvestTest1() {
        //Given
        CropRow testRow = new CropRow();
        Crop testCornStalk = new Crop(Crop.Type.CORNSTALK);
        testRow.store(testCornStalk);
        testCornStalk.fertilized();

        //When
        Tractor testTractor = new Tractor();
        Edible actual = testTractor.harvest(testRow);

        //Then
        Assert.assertTrue(actual instanceof EarCorn);
        Assert.assertFalse(testCornStalk.hasBeenFertilized());
        Assert.assertTrue(testCornStalk.isHarvested());
    }

    @Test
    public void harvestTest2() {
        //Given
        CropRow testRow = new CropRow();
        Crop testCornStalk = new Crop(Crop.Type.CORNSTALK);
        testRow.store(testCornStalk);

        //When
        Tractor testTractor = new Tractor();
        Edible actual = testTractor.harvest(testRow);

        //Then
        Assert.assertNull(actual);
        Assert.assertFalse(testCornStalk.hasBeenFertilized());
        Assert.assertFalse(testCornStalk.isHarvested());
    }
}
