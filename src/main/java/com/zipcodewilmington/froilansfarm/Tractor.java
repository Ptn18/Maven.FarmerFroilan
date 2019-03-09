package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle implements Rideable {

    Integer numberOfTimesRidden;


    public String makeNoise() {
        return "Vroom rattle chug chug";
    }


// this belongs on crop
    public boolean checkHarvestability(Crop crop) {
        boolean hasBeenFertilized = crop.getHasBeenFertilized();
        boolean canHarvest = !(crop.getHasBeenHarvested());
        return hasBeenFertilized && canHarvest;
    }


    public Edible harvest(CropRow rowNumber){
        Crop thisCrop = rowNumber.getByIndex(0);
        Edible thisEdible = thisCrop.yield();
        rowNumber.remove(thisCrop);
        thisCrop.setHasBeenHarvested();
        thisCrop.setHasBeenFertilized();
        return thisEdible;
    }


//
//    void operate() {
//        super.operate();
//    }
//

}
