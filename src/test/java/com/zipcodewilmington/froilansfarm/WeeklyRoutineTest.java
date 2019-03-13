package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WeeklyRoutineTest {

    Farm froilanFarm = FarmFactory.create();

    List<Container> allContainers = froilanFarm.getContainers();
    List<Container> fields = froilanFarm.getSpecificContainers(FarmItems.CROPROW);
    List<Container> farmHouses = froilanFarm.getSpecificContainers(FarmItems.PERSON);
    List<Container> stables = froilanFarm.getSpecificContainers(FarmItems.HORSE);
    List<Container> chickenCoops = froilanFarm.getSpecificContainers(FarmItems.CHICKEN);
    List<Container> barns = froilanFarm.getSpecificContainers(FarmItems.VEHICLE);

    Tractor tractor = Tractor.getTractor(froilanFarm);
    Cropduster cropduster = Cropduster.getCropduster(froilanFarm);

    Farmer froilan = Farmer.getFarmer(froilanFarm);
    Pilot froilanda = Pilot.getPilot(froilanFarm);

    @Test
    public void farmCreationTest() {
        Assert.assertEquals(11, allContainers.size());
        Assert.assertEquals(1, fields.size());
        Assert.assertEquals(1, farmHouses.size());
        Assert.assertEquals(3, stables.size());
        Assert.assertEquals(4, chickenCoops.size());
        Assert.assertEquals(1, barns.size());
    }

    @Test
    public void sundayTest() {
//        WeeklyRoutineUtilities.dailyRoutine();

        FarmFactory.plantField(froilanFarm);

        //Assert horses ridden = 10
        //Assert horses fed = 10
        //Assert eggs eaten = 7 (5 froilan 2 froilanda)
        //Assert ears of corn eaten = 3 (1 froilan 2 froilanda)
        //Assert tomatoes eaten = 3 (2 froilan 1 froilanda)

        List<CropRow> cropRows = fields.get(0).getItems();

        //Then
        Assert.assertEquals(5, fields.get(0).getItems().size());
        Assert.assertEquals(Crop.Type.CORNSTALK, cropRows.get(0).getTypePlanted());
        Assert.assertEquals(Crop.Type.TOMATO_PLANT, cropRows.get(1).getTypePlanted());
        Assert.assertEquals(Crop.Type.POTATO_PLANT, cropRows.get(2).getTypePlanted());
        Assert.assertEquals(Crop.Type.POTATO_PLANT, cropRows.get(3).getTypePlanted());
        Assert.assertEquals(Crop.Type.POTATO_PLANT, cropRows.get(4).getTypePlanted());
    }

    @Test
    public void mondayTest() {

//        WeeklyRoutineUtilities.dailyRoutine();
        List<Crop> allCrops = cropduster.getAllCrops((Field) fields.get(0));
        WeeklyRoutineUtilities.fertilizeField(froilanFarm);
        Integer expectedNumberFertizlied = 50;
        List<CropRow> allrows = fields.get(0).getItems();

        Integer actualNumberFertilized = cropduster.getNumberCropsFertilized(allCrops);

        //Then
        Assert.assertEquals(expectedNumberFertizlied, actualNumberFertilized);
    }

    @Test
    public void tuesdayTest() {
//        WeeklyRoutineUtilities.dailyRoutine();
//        WeeklyRoutineUtilities.harvestCrops();

        //Then
        //Assert # crops harvested = 50
        //Assert size of List<Crop> = 0

    }

    @Test
    public void wednesdayTest() {
//        WeeklyRoutineUtilities.dailyRoutine();
        FarmFactory.plantField(froilanFarm);

        List<CropRow> cropRows = fields.get(0).getItems();

        //Then
        Assert.assertEquals(5, fields.get(0).getItems().size());
        Assert.assertEquals(Crop.Type.CORNSTALK, cropRows.get(0).getTypePlanted());
        Assert.assertEquals(Crop.Type.TOMATO_PLANT, cropRows.get(1).getTypePlanted());
        Assert.assertEquals(Crop.Type.POTATO_PLANT, cropRows.get(2).getTypePlanted());
        Assert.assertEquals(Crop.Type.POTATO_PLANT, cropRows.get(3).getTypePlanted());
        Assert.assertEquals(Crop.Type.POTATO_PLANT, cropRows.get(4).getTypePlanted());
    }

    @Test
    public void thursdayTest() {
//        WeeklyRoutineUtilities.dailyRoutine();
//        WeeklyRoutineUtilities.fertilizeField(froilanFarm);
    }

    @Test
    public void fridayTest() {
//        WeeklyRoutineUtilities.dailyRoutine();
//        WeeklyRoutineUtilities.harvestCrops(froilanFarm);
    }



}


//    As a farmer, Froilan must stick to a rigorous agricultural routine.
//        Every morning, Froilan and Froilanda begin their morning by
//
//        Riding each Horse in each Stable.
//        Feeding each Horse 3 ear of Corn.
//        For breakfast,
//        Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
//        Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
//        Sunday, Froilan plants 3 different type of Crop in his first, second, and third CropRow.
//
//        On Monday, his sister, Froilanda uses the CropDuster to fly over the Field and fertilize each of the CropRow
//
//        On Tuesday, Froilan uses his Tractor to harvest each Crop in each CropRow.