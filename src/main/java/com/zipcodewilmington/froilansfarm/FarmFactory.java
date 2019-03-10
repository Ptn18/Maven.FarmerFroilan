package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static com.zipcodewilmington.froilansfarm.AnimalFactory.AnimalType.*;

public class FarmFactory {
    
    public static Farm create() {
        Farm farm = new Farm();
        
        FarmHouse house = createFarmHouse();
        farm.addContainer(house);
        
        List<ChickenCoop> coop = createChickenCoop();
        farm.addChickenCoop(coop);
        
        List<Stable> stable = createStable();
        farm.addStables(stable);
        
        Cropduster cropduster = new Cropduster();
        Tractor tractor = new Tractor();
        
        farm.addTractor(tractor);
        farm.addCropduster(cropduster);
        
        Field field = createField();
        farm.addField(field);
        
        return farm;
    }
    
    private static Field createField() {
        Field field = new Field();
        
        field.store(createCropRow(Crop.Type.CORNSTALK));
        field.store(createCropRow(Crop.Type.TOMATO_PLANT));
        field.store(createCropRow(Crop.Type.POTATO_PLANT));
        field.store(createCropRow(Crop.Type.POTATO_PLANT));
        field.store(createCropRow(Crop.Type.POTATO_PLANT));
        
        return field;
    }
    
    private static CropRow createCropRow(Crop.Type type) {
        CropRow cropRow = new CropRow();
        for (int i = 0; i < 10; i++) {
            Crop crop = new Crop(type);
            cropRow.store(crop);
        }
        
        return cropRow;
    }
    
    private static FarmHouse createFarmHouse() {
        FarmHouse farmHouse = new FarmHouse();
        AnimalFactory froilanAnimal = AnimalFactory.createFactory(FARMER);
        Farmer froilan = (Farmer) froilanAnimal;
        //Farmer froilan = new Farmer("Froilan",40,1);
        farmHouse.store(froilan);
        
        //Farmer froilanda = new Farmer("Froilanda", 25, 2);
        AnimalFactory froilandaAnimal = AnimalFactory.createFactory(PILOT);
        Pilot froilanda = (Pilot) froilandaAnimal;
        farmHouse.store(froilanda);
        
        return farmHouse;
    }
    
    private static List<Stable> createStable() {
        List<Stable> stables = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            Stable stable = new Stable();
            for (int i = 0; i < 4; i++) {
                Horse horse = new Horse("Maximus" + i, 3, 1 + i);
                stable.store(horse);
            }
            stables.add(stable);
        }
        return stables;
    }
    
    private static List<ChickenCoop> createChickenCoop() {
        List<ChickenCoop> coops = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            ChickenCoop chickenCoop = new ChickenCoop();
            for (int i = 0; i < 4; i++) {
                Chicken chicken = new Chicken("Cooper" + i, 2, 1 + i);
                chickenCoop.store(chicken);
            }
            coops.add(chickenCoop);
        }
        return coops;
    }
    
}
