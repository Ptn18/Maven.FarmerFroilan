package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Field extends Container<CropRow> {

    public static Field getField(Farm farm) {
        return (Field) farm.getSpecificContainers(FarmItems.CROPROW).get(0);
    }
}
