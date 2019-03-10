package com.zipcodewilmington.froilansfarm;

public class ContainerFactory {

    private FarmItems itemToStore;


    public static Container createContainer(FarmItems itemToStore) {

        Container newContainer = null;

        switch (itemToStore) {
            case CHICKEN:
                newContainer = new ChickenCoop();
                break;

            case CROP:
                newContainer = new CropRow();
                break;

            case CROPROW:
                newContainer = new Field();
                break;

            case EDIBLE:
                newContainer = new Silo();
                break;

            case HORSE:
                newContainer = new Stable();
                break;

            case PERSON:
                newContainer = new FarmHouse();
                break;

            case VEHICLE:
                newContainer = new Barn();
        }
        return newContainer;
    }



}
