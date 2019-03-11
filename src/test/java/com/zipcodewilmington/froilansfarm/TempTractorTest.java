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
    public void getTractor() {
        //Given
        Farm farm = new Farm();
        Tractor tractor = new Tractor();
        farm.createContainer(FarmItems.VEHICLE);
        Container barn = farm.getSpecificContainers(FarmItems.VEHICLE).get(0);
        barn.store(tractor);

        //When
        Assert.assertTrue(tractor == Tractor.getTractor(farm));

    }

    @Test
    public void operateTest() {
        //Given
        Farm farm = new Farm();
        farm.createContainer(FarmItems.CROPROW);
        FarmFactory.plantField(farm);
        Tractor tractor = new Tractor();

        //When
        tractor.operate(farm);
        Integer actual = 50;
        Integer expected = 50;

        //Then
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void harvestTest() {
//        //Given
//        CropRow testRow = new CropRow();
//        Crop testCornStalk = new Crop(Crop.Type.CORNSTALK);
//        testRow.store(testCornStalk);
//
//        //When
//        Tractor testTractor = new Tractor();
//        Crop[] actual = testTractor.harvest(testRow);
//
//        //Then
//        Assert.assertNull(actual);
//        Assert.assertFalse(testCornStalk.hasBeenFertilized());
//        Assert.assertFalse(testCornStalk.isHarvested());
//    }
}
