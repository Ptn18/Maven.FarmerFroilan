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

    public Integer operate(Farm farm){
        System.out.println(makeNoise());
        Field field = Field.getField(farm);
        return harvestField(this, field);
    }


    private Integer harvestField(Tractor tractor, Field field) {
        Integer cropsHarvested = 0;
        List<CropRow> cropRows = field.getItems();
        for (int i = 0; i < field.numberHolding() ; i++) {
            CropRow rowToHarvest = cropRows.get(i);
            cropsHarvested += harvestCropRow(this, rowToHarvest);
        }
        return cropsHarvested;
    }

    private Integer harvestCropRow(Tractor tractor, CropRow rowToHarvest) {
        Integer cropsHarvested = 0;
        List<Crop> crops = rowToHarvest.getItems();
        for (int i = 0; i < crops.size() ; i++) {
            Crop cropToHarvest = crops.get(i);
//            cropsHarvested = tractor.harvest(cropToHarvest, rowToHarvest);

        }
        return cropsHarvested;
    }

    private List<Crop> harvest(Crop crop, CropRow rowToHarvest) {
        Integer cropsHarvested = 0;
        ArrayList<Crop> harvestedCrops = new ArrayList<>();
        if(crop.checkHarvestability()) {
            harvestedCrops.add(crop);
            rowToHarvest.remove(crop);
            crop.setHarvested();
            crop.fertilized();}
        return harvestedCrops;
    }
}
