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
//This belongs on crop
    @Test
    public void checkHarvestabilityTest() {
        //Given
        CropRow testRow = new CropRow();
        Crop testCornStalk = new CornStalk();
        testRow.store(testCornStalk);
        testCornStalk.setHasBeenFertilized();

        //When
        Tractor testTractor = new Tractor();
        Boolean actual = testTractor.checkHarvestability(testCornStalk);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void harvestTest() {
        //Given
        CropRow testRow = new CropRow();
        Crop testCornStalk = new CornStalk();
        testRow.store(testCornStalk);
        testCornStalk.setHasBeenFertilized();

        //When
        Tractor testTractor = new Tractor();
        Edible actual = testTractor.harvest(testRow);

        //Then
        Assert.assertTrue(actual instanceof EarCorn);
        Assert.assertFalse(testCornStalk.getHasBeenFertilized());
        Assert.assertTrue(testCornStalk.getHasBeenHarvested());
    }
}
