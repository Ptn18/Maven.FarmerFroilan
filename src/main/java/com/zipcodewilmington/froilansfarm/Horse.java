package com.zipcodewilmington.froilansfarm;

import java.util.Date;

public class Horse extends Animal implements Rideable {
    private String name;
    private Integer age;
    private Integer id;
    private boolean hasBeenRidden;
    
    public Horse(String name, Integer age, Integer id) {
        super(name, age, id);
    }
    
    public void create(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public void eat(Edible food) {
        System.out.println("Yum!");
    }
    
    @Override
    public String makeNoise() {
        return "Neigh!";
        
    }
    
    public boolean getHasBeenRidden() {
        return hasBeenRidden;
    }
    
    public void setHasBeenRidden(boolean flag) {
        this.hasBeenRidden = flag;
    }
    
}
