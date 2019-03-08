package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {

    public void eat(Edible food) {
        System.out.println("Yum!");
    }

    public EdibleEgg yield() {
        return null;
        }

    public boolean hasBeenFertilized() {
        return false;
    }
}
