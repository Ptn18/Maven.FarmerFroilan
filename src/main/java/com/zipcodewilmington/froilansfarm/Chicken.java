package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;
    public void eat(Edible food) {
        System.out.println("Yum!");
    }

    public void yield() {
        }

    public boolean hasBeenFertilized() {
        return false;
    }
}
