package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist {
    public void eat(String food) {
        System.out.println("Yum");
    }

    @Override
    public void mount(String vehicle) {
    }

    @Override
    public void ride() {
    }

    @Override
    public void dismount(String vehicle) {

    }

    @Override
    public void makeNoise() {

    }

    public void plant(Crop crop) {
        System.out.println("Planted!");
    }
}
