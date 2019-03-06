package com.zipcodewilmington.froilansfarm;

public abstract class Crop implements Produce {
    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    @Override
    public String yield(String produce) {
        return null;
    }

}

//Should be a generic?