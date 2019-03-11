package com.zipcodewilmington.froilansfarm;

import java.util.List;
import java.util.stream.Stream;

import static com.zipcodewilmington.froilansfarm.AnimalFactory.AnimalType.FARMER;
import static com.zipcodewilmington.froilansfarm.AnimalFactory.AnimalType.PILOT;

public class FarmFactory {


    public static Farm create(){
        Farm farm = new Farm();

        FarmItems[] containersToCreate = {
                FarmItems.PERSON,
                FarmItems.CROPROW,
                FarmItems.CHICKEN,
                FarmItems.CHICKEN,
                FarmItems.CHICKEN,
                FarmItems.CHICKEN,
                FarmItems.HORSE,
                FarmItems.HORSE,
                FarmItems.HORSE,
                FarmItems.VEHICLE,
                FarmItems.EDIBLE
        };

        createContainers(farm, containersToCreate);
        populateFarmhouse(farm);
        populateStable(farm);
        populateChickenCoop(farm);
        populateBarn(farm);

     return farm;
    }


    public static void createContainers(Farm farm, FarmItems[] containersToCreate) {
        Stream<FarmItems> containerStream = Stream.of(containersToCreate);
        containerStream.forEach(farm::createContainer);
    }


    public static void plantField(Farm farm) {
        List<Container> fields = farm.getSpecificContainers(FarmItems.CROPROW);

        for (Container field: fields) {
            field.store(createCropRow(Crop.Type.CORNSTALK));
            field.store(createCropRow(Crop.Type.TOMATO_PLANT));
            field.store(createCropRow(Crop.Type.POTATO_PLANT));
            field.store(createCropRow(Crop.Type.POTATO_PLANT));
            field.store(createCropRow(Crop.Type.POTATO_PLANT));
        }
    }
    
    private static CropRow createCropRow(Crop.Type type) {
        CropRow cropRow = (CropRow) ContainerFactory.createContainer(FarmItems.CROP);
        cropRow.setTypePlanted(type);
        for (int i = 0; i < 10; i++) {
            Crop crop = new Crop(type);
            cropRow.store(crop);
        }
        return cropRow;
    }
    
    private static void populateFarmhouse(Farm farm) {
        List<Container> farmHouses = farm.getSpecificContainers(FarmItems.PERSON);
        Container farmhouse = farmHouses.get(0);

//        AnimalFactory froilanAnimal = AnimalFactory.createFactory(FARMER);
//        Farmer froilan = (Farmer) froilanAnimal;
        Farmer froilan = new Farmer("Froilan",40,1);
        farmhouse.store(froilan);

//        AnimalFactory froilandaAnimal = AnimalFactory.createFactory(PILOT);
//        Pilot froilanda = (Pilot) froilandaAnimal;
        Farmer froilanda = new Farmer("Froilanda", 25, 2);
        farmhouse.store(froilanda);
    }
    
    private static void populateStable(Farm farm) {
        List<Container> stables = farm.getSpecificContainers(FarmItems.HORSE);
        for (int j = 0; j < stables.size(); j++) {
            Container stable = stables.get(j);
            for (int i = 0; i < 4; i++) {
                Horse horse = new Horse("Maximus" + i, 3, 1 + i);
                stable.store(horse);
            }
        }
    }
    
    private static void populateChickenCoop(Farm farm) {
        List<Container> chickenCoops = farm.getSpecificContainers(FarmItems.CHICKEN);
        for (int j = 0; j < chickenCoops.size(); j++) {
            Container chickenCoop = chickenCoops.get(j);
            for (int i = 0; i < 4; i++) {
                Chicken chicken = new Chicken("Cooper" + i, 2, 1 + i);
                chickenCoop.store(chicken);
            }
        }
    }

    private static void populateBarn(Farm farm) {
        List<Container> barns = farm.getSpecificContainers(FarmItems.VEHICLE);
        Container barn = barns.get(0);

        Cropduster cropduster = new Cropduster();
        Tractor tractor = new Tractor();

        barn.store(cropduster);
        barn.store(tractor);
    }

}
