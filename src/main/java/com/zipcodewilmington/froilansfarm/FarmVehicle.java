package com.zipcodewilmington.froilansfarm;

import java.util.List;

public abstract class FarmVehicle extends Vehicle {
    abstract List<Crop> operate(Farm farm);

    public static List<FarmVehicle> getFarmVehicles(Farm farm) {
        return farm.getSpecificContainers(FarmItems.VEHICLE).get(0).getItems();
    }
}
