package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Botanist, Rider {
    
    private String name;
    private Integer age;
    private Integer id;
    private Silo silo;
    private Stable stable;
    private Barn barn;
    
    public Farmer() {
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
        if (transport instanceof Animal) {
            stable.remove((Horse) transport);
        } else if (transport instanceof FarmVehicle) {
            barn.remove((FarmVehicle) transport);
        }
    }
    
    
    public void ride() {
        System.out.println("We're ridin' along!");
    }
    
    
    public void dismount(Rideable transport) {
        if (transport instanceof Animal) {
            stable.store((Horse) transport);
        } else if (transport instanceof FarmVehicle) {
            barn.store((FarmVehicle) transport);
        }
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
    
    public void setStable(Stable stable) {
        this.stable = stable;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Silo getSilo() {
        return silo;
    }
    
    public void setSilo(Silo silo) {
        this.silo = silo;
    }
    
    public Stable getStable() {
        return stable;
    }
    
    public Barn getBarn() {
        return barn;
    }
    
    public void setBarn(Barn barn) {
        this.barn = barn;
    }
}