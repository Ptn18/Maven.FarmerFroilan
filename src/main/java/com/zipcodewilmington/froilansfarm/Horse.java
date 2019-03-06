package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable {
    public void eat(String food) {
        System.out.println("Yum!");
    }

    @Override
    public void makeNoise() {

    }
}
