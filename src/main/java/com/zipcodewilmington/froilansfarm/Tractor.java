package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle implements Rideable {

    public String makeNoise() {
        return "Vroom rattle chug chug";
    }

    public Edible harvest(CropRow rowNumber){
        Crop thisCrop = rowNumber.getByIndex(0);
        Edible thisEdible = thisCrop.yield();
        if(!thisCrop.checkHarvestability()) {
            thisEdible = null;
        } else {
        rowNumber.remove(thisCrop);
        thisCrop.setHarvested();
        thisCrop.fertilized();}
        return thisEdible;
    }

}
