package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TempContainerFactoryTest {

    @Test
    public void createChickenContainerTest() {

        //Given
        FarmItems toStore = FarmItems.CHICKEN;

        //When
        Container coop = ContainerFactory.createContainer(toStore);

        //Then
        Assert.assertTrue(coop instanceof ChickenCoop);
    }

    @Test
    public void createHorseContainerTest() {

        //Given
        FarmItems toStore = FarmItems.HORSE;

        //When
        Container coop = ContainerFactory.createContainer(toStore);

        //Then
        Assert.assertTrue(coop instanceof Stable);
    }

    @Test
    public void createPersonContainerTest() {

        //Given
        FarmItems toStore = FarmItems.PERSON;

        //When
        Container coop = ContainerFactory.createContainer(toStore);

        //Then
        Assert.assertTrue(coop instanceof FarmHouse);
    }

    @Test
    public void createCropContainerTest() {

        //Given
        FarmItems toStore = FarmItems.CROP;

        //When
        Container coop = ContainerFactory.createContainer(toStore);

        //Then
        Assert.assertTrue(coop instanceof CropRow);
    }

    @Test
    public void createCropRowContainerTest() {

        //Given
        FarmItems toStore = FarmItems.CROPROW;

        //When
        Container coop = ContainerFactory.createContainer(toStore);

        //Then
        Assert.assertTrue(coop instanceof Field);
    }

    @Test
    public void createVehicleContainerTest() {

        //Given
        FarmItems toStore = FarmItems.VEHICLE;

        //When
        Container coop = ContainerFactory.createContainer(toStore);

        //Then
        Assert.assertTrue(coop instanceof Barn);
    }

    @Test
    public void createEdibleContainerTest() {

        //Given
        FarmItems toStore = FarmItems.EDIBLE;

        //When
        Container coop = ContainerFactory.createContainer(toStore);

        //Then
        Assert.assertTrue(coop instanceof Silo);
    }
}
