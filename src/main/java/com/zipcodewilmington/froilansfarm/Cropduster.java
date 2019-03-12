package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Cropduster extends FarmVehicle implements Aircraft{

    public String makeNoise() {
        return "Putter putter rattle woosh";
    }

    public static Cropduster getCropduster(Farm farm) {
        List<FarmVehicle> farmVehicles = FarmVehicle.getFarmVehicles(farm);
        Cropduster plane = null;
        for (Vehicle vehicle : farmVehicles) {
            if(vehicle instanceof Cropduster) {
                plane = (Cropduster) vehicle;
            }
        }
        return plane;
    }

    public List<Crop> operate(Farm farm){
        System.out.println(makeNoise());
        Field field = Field.getField(farm);
        List<Crop> allCrops = getAllCrops(field);
        return fertilize(allCrops);
    }

    public List<Crop> getAllCrops(Field field) {
        List<Crop> cropsToFertilize = new ArrayList<>();
        List<CropRow> cropRows = field.getItems();
        for (CropRow row: cropRows) {
            cropsToFertilize.addAll(row.getItems());
        }
        return cropsToFertilize;
    }

    private List<Crop> fertilize(List<Crop> cropstoFertilize) {
        ArrayList<Crop> fertilizedCrops = new ArrayList<>();
        for(Crop crop : cropstoFertilize) {
            if (!crop.hasBeenFertilized()) {
                fertilizedCrops.add(crop);
                crop.fertilized();
            }
        }
        return fertilizedCrops;
    }
}
