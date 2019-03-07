package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist, Rider {
    public void eat(Edible food) {
        System.out.println("Yum");
    }


    public void mount(Rideable transport) {
    }


    public void ride() {
    }


    public void dismount(Rideable transport) {

    }

    @Override
    public String makeNoise() {
        return null;

    }

    public void plant(Crop crop) {
        System.out.println("Planted!");
    }
}
