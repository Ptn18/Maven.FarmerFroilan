package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person implements Rider{
    
    private String name;
    private Integer age;
    private Integer id;
    
    public Pilot(String name, Integer age, Integer id) {
        super(name, age, id);}
    
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
