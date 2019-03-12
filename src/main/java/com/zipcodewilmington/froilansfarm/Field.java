package com.zipcodewilmington.froilansfarm;

public class Field extends Container<CropRow> {

    public static Field getField(Farm farm) {
        return (Field) farm.getSpecificContainers(FarmItems.CROPROW).get(0);
    }
}
