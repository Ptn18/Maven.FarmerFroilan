package com.zipcodewilmington.froilansfarm;

public abstract class Crop<CropType extends Edible> implements Produce{

    private CropType crop;

    public Crop() {
    }

    public Crop(CropType crop) {
        this.crop = crop;
    }



    //required by Produce
    public Edible yield() {
        return null;
    }

    public boolean hasBeenFertilized() {
        return true;
    }




    //    private boolean hasBeenHarvested;

}

//Should be a generic?