package com.zipcodewilmington.froilansfarm;

public class Crop<CropType extends Edible> implements Produce{

    private Type type;
    private boolean fertilized;
    private boolean harvested;


    public Crop() {
        this.type = Type.CORNSTALK;
    }

    public Crop(Type type) {
        this.type = type;
        this.fertilized = false;
        this.harvested = false;
    }

    //required by Produce
    public Edible yield() {
//        harvested = true;
        return EdibleFactory.create(type);
    }

    public boolean hasBeenFertilized() {
        return fertilized;
    }


    public void fertilized(){
        fertilized = !fertilized;
//        this.fertilized = true;
    }

    public boolean isHarvested(){
        return harvested;
    }

    public void setHarvested(){
        harvested = !harvested;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        CORNSTALK, POTATO_PLANT, TOMATO_PLANT
    }

    public boolean checkHarvestability() {
        return hasBeenFertilized() && !isHarvested();
    }

}

