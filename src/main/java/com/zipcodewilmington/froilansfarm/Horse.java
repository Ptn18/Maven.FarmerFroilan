package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable, Livestock {
    public void eat(Edible food) {
        System.out.println("Yum!");
    }

    @Override
    public String makeNoise() {
        return null;

    }
}
