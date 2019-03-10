package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle implements Rideable {

    Integer numberOfTimesRidden;


    public String makeNoise() {
        return "Vroom rattle chug chug";
    }


// this belongs on crop
    public boolean checkHarvestability(Crop crop) {
        boolean hasBeenFertilized = crop.hasBeenFertilized();
        boolean canHarvest = !(crop.isHarvested());
        return hasBeenFertilized && canHarvest;
    }


    public Edible harvest(CropRow rowNumber){
        Crop thisCrop = rowNumber.getByIndex(0);
        Edible thisEdible = thisCrop.yield();
        rowNumber.remove(thisCrop);
        thisCrop.setHarvested();
        thisCrop.fertilized();
        return thisEdible;
    }


//
//    void operate() {
//        super.operate();
//    }
//

}
