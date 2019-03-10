package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist, Rider {
    
    private String name;
    private Integer age;
    private Integer id;
    private Silo silo;
    
    public Farmer(){
        name = "Froilan";
        age = 40;
        id = 1;
    }
    
    public Farmer(String name, Integer age, Integer id) {
        super(name, age, id);
    }
    
    public void eat(Edible food) {
        silo.remove(food);
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
        rowNumber.store(crop);
        
    }
    
    public void storeEdible(Edible edible) {
        silo.store(edible);
    }
    
    public void setSilo(Silo silo) {
        this.silo = silo;
    }
}
