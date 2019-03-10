package com.zipcodewilmington.froilansfarm;

public class Cropduster extends FarmVehicle implements Aircraft{

    public String makeNoise() {
        return "Putter putter rattle woosh";
    }

    public void fertilize(CropRow rowNumber) {
        Crop thisCrop = rowNumber.getByIndex(0);
        if(!thisCrop.hasBeenFertilized()) {
            thisCrop.fertilized();}
    }

}
