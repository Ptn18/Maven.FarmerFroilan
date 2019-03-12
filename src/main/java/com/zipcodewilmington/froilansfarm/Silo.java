package com.zipcodewilmington.froilansfarm;

public class Silo extends Container<Edible> {

    public static Silo getSilo(Farm farm) {
        return (Silo) farm.getSpecificContainers(FarmItems.EDIBLE).get(0);
    }
}
