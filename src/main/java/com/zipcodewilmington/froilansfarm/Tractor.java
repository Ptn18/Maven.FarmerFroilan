package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {
    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    void operate() {
        super.operate();
    }

    void harvest(Crop produce){}
}
