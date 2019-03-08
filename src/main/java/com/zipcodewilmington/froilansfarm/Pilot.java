package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person implements Rider{
    public void eat(Edible food) {
        System.out.println("Yum!");
    }

    public String makeNoise() {
        return null;
    }

    public void mount(Rideable transport) {
    }

    public void ride() {

    }

    public void dismount(Rideable transport) {
    }

    public void fly(Aircraft aircraft) {

    }
}
