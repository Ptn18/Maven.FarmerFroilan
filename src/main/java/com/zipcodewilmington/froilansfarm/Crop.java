package com.zipcodewilmington.froilansfarm;

public class Crop<T extends Edible> implements Produce {

    private T crop;

    public Crop(T crop) {
        this.crop = crop;
    }



    //required by Produce
    public void yield() {

    }

    public boolean hasBeenFertilized() {
        return true;
    }




    //    private boolean hasBeenHarvested;

}

//Should be a generic?