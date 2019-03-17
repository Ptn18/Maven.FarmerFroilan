package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmItems;

import java.util.List;

public abstract class FarmVehicle extends Vehicle {
    abstract void operate(Farm farm);

    public static List<FarmVehicle> getFarmVehicles(Farm farm) {
        return farm.getSpecificContainers(FarmItems.VEHICLE).get(0).getItems();
    }
}
