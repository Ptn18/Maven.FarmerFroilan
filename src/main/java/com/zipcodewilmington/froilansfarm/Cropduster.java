package com.zipcodewilmington.froilansfarm;

public class Cropduster extends FarmVehicle implements Aircraft{

    public String makeNoise() {
        return "Putter putter rattle woosh";
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
