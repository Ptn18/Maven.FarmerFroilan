package com.zipcodewilmington.froilansfarm.Containers;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmItems;

public class Field extends Container<CropRow> {

    public static Field getField(Farm farm) {
        return (Field) farm.getSpecificContainers(FarmItems.CROPROW).get(0);
    }
}
