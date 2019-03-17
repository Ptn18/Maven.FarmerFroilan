package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Containers.CropRow;
import com.zipcodewilmington.froilansfarm.Containers.Field;
import com.zipcodewilmington.froilansfarm.Edibles.Crop;
import com.zipcodewilmington.froilansfarm.Farm;

import java.util.ArrayList;
import java.util.List;

public abstract class Cropduster extends FarmVehicle implements Aircraft {

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

    public void operate(Farm farm){
        System.out.println(makeNoise());
        Field field = Field.getField(farm);
        List<Crop> allCrops = getAllCrops(field);
        fertilize(allCrops);
    }

    public List<Crop> getAllCrops(Field field) {
        List<Crop> cropsToFertilize = new ArrayList<>();
        List<CropRow> cropRows = field.getItems();
        for (CropRow row: cropRows) {
            cropsToFertilize.addAll(row.getItems());
        }
        return cropsToFertilize;
    }

    private void fertilize(List<Crop> cropsToFertilize) {
        ArrayList<Crop> fertilizedCrops = new ArrayList<>();
        for(Crop crop : cropsToFertilize) {
            if (!crop.hasBeenFertilized()) {
                fertilizedCrops.add(crop);
                crop.fertilized();
            }
        }
    }

    public Integer getNumberCropsFertilized(List<Crop> crops) {
        Integer numberFertilized = 0;

        for (Crop crop : crops) {
            if(crop.hasBeenFertilized()) {
                numberFertilized++;
            }
        }
        return numberFertilized;
    }
}
