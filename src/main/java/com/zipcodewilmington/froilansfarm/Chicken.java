package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    public void eat(String food) {
        System.out.println("Yum!");
    }

    public String yield(String produce) {
        return "Yum!";}
}
