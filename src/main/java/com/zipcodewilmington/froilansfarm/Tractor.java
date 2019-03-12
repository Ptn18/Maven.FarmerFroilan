package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Tractor extends FarmVehicle implements Rideable {

    public String makeNoise() {
        return "Vroom rattle chug chug";
    }

    public static Tractor getTractor(Farm farm) {
        List<FarmVehicle> farmVehicles = FarmVehicle.getFarmVehicles(farm);
        Tractor tractor = null;
        for (Vehicle vehicle : farmVehicles) {
            if(vehicle instanceof Tractor) {
                tractor = (Tractor) vehicle;
            }
        }
        return tractor;
    }

    public List<Crop> operate(Farm farm){
        System.out.println(makeNoise());
        Field field = Field.getField(farm);
        List<Crop> allCrops = getAllCrops(field);
        List<Crop> harvestedCrops = harvest(allCrops);
        removeAllCrops(field);
        return harvestedCrops;
    }

    public List<Crop> getAllCrops(Field field) {
        List<Crop> cropsToHarvest = new ArrayList<>();
        List<CropRow> cropRows = field.getItems();
        for (CropRow row: cropRows) {
            cropsToHarvest.addAll(row.getItems());
        }
        return cropsToHarvest;
    }

    public List<Crop> harvest(List<Crop> cropsToHarvest) {
        ArrayList<Crop> harvestedCrops = new ArrayList<>();
        for (Crop crop : cropsToHarvest) {
            if(crop.checkHarvestability()) {
                harvestedCrops.add(crop);
                crop.setHarvested();
                crop.fertilized();}
        }
        return harvestedCrops;
    }

    public void removeAllCrops(Field field) {
        List<CropRow> cropRows = field.getItems();
        cropRows.clear();
    }
}
