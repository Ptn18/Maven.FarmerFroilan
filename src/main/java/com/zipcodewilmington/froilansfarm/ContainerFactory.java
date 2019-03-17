package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Containers.*;

public class ContainerFactory {

    private FarmItems itemToStore;


    public static Container createContainer(FarmItems itemToStore) {

        Container newContainer = null;

        switch (itemToStore) {
            case CHICKEN:
                newContainer = new ChickenCoop();
                newContainer.setContains(FarmItems.CHICKEN);
                break;

            case CROP:
                newContainer = new CropRow();
                newContainer.setContains(FarmItems.CROP);
                break;

            case CROPROW:
                newContainer = new Field();
                newContainer.setContains(FarmItems.CROPROW);
                break;

            case EDIBLE:
                newContainer = new Silo();
                newContainer.setContains(FarmItems.EDIBLE);
                break;

            case HORSE:
                newContainer = new Stable();
                newContainer.setContains(FarmItems.HORSE);
                break;

            case PERSON:
                newContainer = new FarmHouse();
                newContainer.setContains(FarmItems.PERSON);
                break;

            case VEHICLE:
                newContainer = new Barn();
                newContainer.setContains(FarmItems.VEHICLE);
        }
        return newContainer;
    }



}
