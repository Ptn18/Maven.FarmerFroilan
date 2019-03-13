package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        farm.createContainer(FarmItems.EDIBLE);
        Silo silo = (Silo) farm.getSpecificContainers(FarmItems.EDIBLE).get(0);
        FarmFactory.plantField(farm);
        Cropduster cropduster = new Cropduster();
        cropduster.operate(farm);
        Tractor tractor = new Tractor();

        //When
        Integer expected = 50;
        tractor.operate(farm);
        Integer actual = silo.numberHolding();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestTest() {
        //Given
        CropRow testRow = new CropRow();
        Crop testCrop = new Crop(Crop.Type.CORNSTALK);
        testRow.store(testCrop);
        testCrop.fertilized();
        Tractor testTractor = new Tractor();

        //When

        long actual = testTractor.harvest(testRow.getItems()).size();

//        //Then
        Assert.assertEquals(1, actual);
        Assert.assertFalse(testCrop.hasBeenFertilized());
        Assert.assertTrue(testCrop.isHarvested());
    }

    @Test
    public void removeAllCropsTest() {
        //Given
        Farm farm = new Farm();
        farm.createContainer(FarmItems.CROPROW);
        FarmFactory.plantField(farm);
        Field field = Field.getField(farm);

        //When
        Tractor testTractor = new Tractor();
        testTractor.removeAllCrops(field);
        Integer expected = 0;
        Integer actual = field.numberHolding();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
