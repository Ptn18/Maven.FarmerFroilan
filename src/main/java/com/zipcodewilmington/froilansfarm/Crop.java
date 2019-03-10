package com.zipcodewilmington.froilansfarm;

public class Crop<CropType extends Edible> implements Produce{

    private Type type;
    private boolean fertilized;
    private boolean harvested;

//    public Crop() {
//    }

    //for testing
    public Crop() {
        this.type = Type.CORNSTALK;
    }

    public Crop(Type type) {
        this.type = type;
    }

    //required by Produce
    public Edible yield() {
        setHarvested();
        fertilized();
//        fertilized = false;
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

    public enum Type {
        CORNSTALK, POTATO_PLANT, TOMATO_PLANT
    }

}

