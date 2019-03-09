package com.zipcodewilmington.froilansfarm;

import java.util.function.Supplier;

public class Farmer extends Person implements Botanist, Rider {
 
    private String name;
    private Integer age;
    private Integer id;
    
    public Farmer(String name, Integer age, Integer id) {
        super(name, age, id);}
    
    public void eat(Edible food) {
        System.out.println("Yum");
    }
    
    
    public void mount(Rideable transport) {
    }
    
    
    public void ride() {
    }
    
    
    public void dismount(Rideable transport) {
    
    }
    
    public String makeNoise() {
        return "Hmmm";
    }
    
    public void plant(Crop crop, CropRow rowNumber) {
    
    }
    
    public void storeCrop(Crop crop) {
    
    }
    
}
