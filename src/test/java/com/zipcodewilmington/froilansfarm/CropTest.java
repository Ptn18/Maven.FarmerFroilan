package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.*;
import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void yieldEarCornTest(){
        Crop crop = new Crop(Crop.Type.CORNSTALK);
        //When
        Edible actual = crop.yield();
        //Then
        Assert.assertTrue(actual instanceof EarCorn);
    }

    @Test
    public void yieldPotatoTest(){
        Crop crop = new Crop(Crop.Type.POTATO_PLANT);
        //When
        Edible actual = crop.yield();
        //Then
        Assert.assertTrue(actual instanceof Potato);
    }

    @Test
    public void yieldTomatoTest(){
        Crop crop = new Crop(Crop.Type.TOMATO_PLANT);
        Edible actual = crop.yield();
        Assert.assertTrue(actual instanceof Tomato);
    }



    @Test
    public void testFertilized(){
        //Given
        Crop crop = new Crop();
        Assert.assertFalse(crop.hasBeenFertilized());

        //When
        crop.fertilized();

        Assert.assertTrue(crop.hasBeenFertilized());

    }

    @Test
    public void testHarvested(){
        //When
        Crop crop = new Crop();
        Assert.assertFalse(crop.isHarvested());
        //When
        crop.setHarvested();
        //Then
        Assert.assertTrue(crop.isHarvested());
    }

    @Test
    public void checkHarvestabilityTest1() {
        //Given
        Crop testPlant = new Crop(Crop.Type.TOMATO_PLANT);

        //When
        Boolean actual = testPlant.checkHarvestability();

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void checkHarvestabilityTest2() {
        //Given
        Crop testPlant = new Crop(Crop.Type.TOMATO_PLANT);
        testPlant.fertilized();

        //When
        Boolean actual = testPlant.checkHarvestability();

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void checkHarvestabilityTest3() {
        //Given
        Crop testPlant = new Crop(Crop.Type.TOMATO_PLANT);
        testPlant.fertilized();
        testPlant.setHarvested();

        //When
        Boolean actual = testPlant.checkHarvestability();

        //Then
        Assert.assertFalse(actual);
    }

}
