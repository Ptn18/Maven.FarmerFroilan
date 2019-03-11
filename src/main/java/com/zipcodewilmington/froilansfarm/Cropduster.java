package com.zipcodewilmington.froilansfarm;

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

    public Integer operate(Farm farm){
        Cropduster plane = getCropduster(farm);
        System.out.println(makeNoise());
        Field field = Field.getField(farm);
        return fertilizeField(plane, field);
    }


    public static Integer fertilizeField(Cropduster cropduster, Field field) {
        Integer cropsFertilized = 0;
        List<CropRow> cropRows = field.getItems();
        for (int i = 0; i < field.numberHolding() ; i++) {
            CropRow rowToFertilize = cropRows.get(i);
            cropsFertilized += fertilizeCropRow(cropduster, rowToFertilize);
        }
        return cropsFertilized;
    }

    private static Integer fertilizeCropRow(Cropduster cropduster, CropRow rowToFertilize) {
        Integer cropsFertilized = 0;
        List<Crop> crops = rowToFertilize.getItems();
        for (int i = 0; i < crops.size() ; i++) {
            Crop cropToFertilize = crops.get(i);
            cropsFertilized = cropduster.fertilize(cropToFertilize);;
        }
        return cropsFertilized;
    }

    public Integer fertilize(Crop crop) {
        Integer numberFertilized = 0;
        if(!crop.hasBeenFertilized()) {
            crop.fertilized();
            numberFertilized ++;
        }
        return numberFertilized;
    }
}
