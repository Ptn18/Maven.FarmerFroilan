package com.zipcodewilmington.froilansfarm.Containers;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmItems;

public class Silo extends Container<Edible> {

    public static Silo getSilo(Farm farm) {
        return (Silo) farm.getSpecificContainers(FarmItems.EDIBLE).get(0);
    }
}
