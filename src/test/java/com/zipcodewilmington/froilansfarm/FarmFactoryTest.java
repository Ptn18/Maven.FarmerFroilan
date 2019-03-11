package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class FarmFactoryTest {

    @Test
    public void createTest() {
        Farm testFarm = FarmFactory.create();

        List<Container> allContainers = testFarm.getContainers();
        List<Container> fields = testFarm.getSpecificContainers(FarmItems.CROPROW);
        List<Container> farmHouses = testFarm.getSpecificContainers(FarmItems.PERSON);
        List<Container> stables = testFarm.getSpecificContainers(FarmItems.HORSE);
        List<Container> chickenCoops = testFarm.getSpecificContainers(FarmItems.CHICKEN);
        List<Container> barns = testFarm.getSpecificContainers(FarmItems.VEHICLE);

        //Then
        Assert.assertEquals(11, allContainers.size());
        Assert.assertEquals(1, fields.size());
        Assert.assertEquals(1, farmHouses.size());
        Assert.assertEquals(3, stables.size());
        Assert.assertEquals(4, chickenCoops.size());
        Assert.assertEquals(1, barns.size());

    }

    @Test
    public void createContainersTest() {
        //Given
        Farm froilanFarm = new Farm();
        FarmItems[] containersToCreate = new FarmItems[]{
            FarmItems.PERSON,
            FarmItems.CROPROW,
            FarmItems.CHICKEN,
            FarmItems.HORSE,
            FarmItems.VEHICLE,
            FarmItems.EDIBLE
        };

        //When
        FarmFactory createFarm = new FarmFactory();
        createFarm.createContainers(froilanFarm,containersToCreate );
        int expected = 6;
        int actual = froilanFarm.getContainers().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantFieldTest() {
        //Given
        Farm testFarm = new Farm();
        testFarm.createContainer(FarmItems.CROPROW);
        List<Container> fieldsBefore = testFarm.getSpecificContainers(FarmItems.CROPROW);

        //When
        FarmFactory.plantField(testFarm);
        List<Container> fields = testFarm.getSpecificContainers(FarmItems.CROPROW);
        List<CropRow> cropRows = fields.get(0).getItems();
        int expectedSize = 5;
        int actualSize = cropRows.size();

        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void plantFieldCrop1Test() {
        //Given
        Farm testFarm = new Farm();
        testFarm.createContainer(FarmItems.CROPROW);

        //When
        FarmFactory.plantField(testFarm);
        List<Container> fields = testFarm.getSpecificContainers(FarmItems.CROPROW);
        List<CropRow> cropRows = fields.get(0).getItems();
        Crop.Type expRow = Crop.Type.CORNSTALK;
        Crop.Type actRow = cropRows.get(0).getTypePlanted();

        //Then
        Assert.assertEquals(expRow, actRow);
    }

    @Test
    public void plantFieldCrop2Test() {
        //Given
        Farm testFarm = new Farm();
        testFarm.createContainer(FarmItems.CROPROW);

        //When
        FarmFactory.plantField(testFarm);
        List<Container> fields = testFarm.getSpecificContainers(FarmItems.CROPROW);
        List<CropRow> cropRows = fields.get(0).getItems();
        Crop.Type expRow = Crop.Type.TOMATO_PLANT;
        Crop.Type actRow = cropRows.get(1).getTypePlanted();

        //Then
        Assert.assertEquals(expRow, actRow);
    }

    @Test
    public void plantFieldCrop3Test() {
        //Given
        Farm testFarm = new Farm();
        testFarm.createContainer(FarmItems.CROPROW);

        //When
        FarmFactory.plantField(testFarm);
        List<Container> fields = testFarm.getSpecificContainers(FarmItems.CROPROW);
        List<CropRow> cropRows = fields.get(0).getItems();
        Crop.Type expRow = Crop.Type.POTATO_PLANT;
        Crop.Type actRow1 = cropRows.get(2).getTypePlanted();
        Crop.Type actRow2 = cropRows.get(3).getTypePlanted();
        Crop.Type actRow3 = cropRows.get(4).getTypePlanted();

        //Then
        Assert.assertEquals(expRow, actRow1);
        Assert.assertEquals(expRow, actRow2);
        Assert.assertEquals(expRow, actRow3);
    }

//    --------------------------------------------
//    Tests below are for methods in FarmFactory
//    that are now set to private
//    --------------------------------------------
//
//    @Test
//    public void populateFarmhouseTest() {
//        //Given
//        Farm testFarm = new Farm();
//        testFarm.createContainer(FarmItems.PERSON);
//
//        //When
//        FarmFactory.populateFarmhouse(testFarm);
//        List<Container> farmHouses = testFarm.getSpecificContainers(FarmItems.PERSON);
//        Container farmhouse = farmHouses.get(0);
//        int expected = 2;
//        int actual = farmhouse.getItems().size();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void populateStableTest() {
//        //Given
//        Farm testFarm = new Farm();
//        testFarm.createContainer(FarmItems.HORSE);
//
//        //When
//        FarmFactory.populateStable(testFarm);
//        List<Container> stables = testFarm.getSpecificContainers(FarmItems.HORSE);
//        Container stable = stables.get(0);
//        int expected = 4;
//        int actual = stable.getItems().size();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void populateChickenCoopTest() {
//        //Given
//        Farm testFarm = new Farm();
//        testFarm.createContainer(FarmItems.CHICKEN);
//
//        //When
//        FarmFactory.populateChickenCoop(testFarm);
//        List<Container> chickenCoops = testFarm.getSpecificContainers(FarmItems.CHICKEN);
//        Container chickenCoop = chickenCoops.get(0);
//        int expected = 4;
//        int actual = chickenCoop.getItems().size();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void populateBarnTest() {
//        //Given
//        Farm testFarm = new Farm();
//        testFarm.createContainer(FarmItems.VEHICLE);
//
//        //When
//        FarmFactory.populateBarn(testFarm);
//        List<Container> barns = testFarm.getSpecificContainers(FarmItems.VEHICLE);
//        Container barn = barns.get(0);
//        int expected = 2;
//        int actual = barn.getItems().size();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//        Assert.assertTrue(barn.getItems().get(0) instanceof Cropduster);
//        Assert.assertTrue(barn.getItems().get(1) instanceof Tractor);
//    }
}
