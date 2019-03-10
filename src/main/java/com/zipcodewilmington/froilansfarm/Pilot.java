package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person implements Rider {
    
    private String name;
    private Integer age;
    private Integer id;
    Silo silo;
    Barn barn;
    
    public Pilot() {
        name = "Froilanda";
        age = 25;
        id = 1;
    }
    
    public Pilot(String name, Integer age, Integer id) {
        super(name, age, id);
    }
    
    public void eat(Edible food) {
        silo.remove(food);
    }
    
    public String makeNoise() {
        return "Weee!";
    }
    
    public void mount(Rideable transport) {
        barn.remove((FarmVehicle) transport);
    }
    
    public void ride() {
        System.out.println("I'm ridin' along!");
    }
    
    public void dismount(Rideable transport) {
        barn.store((FarmVehicle) transport);
    }
    
    public void fly(Aircraft aircraft) {
        System.out.println("I'm cropdustin'!");
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
    
    public Barn getBarn() {
        return barn;
    }
    
    public void setBarn(Barn barn) {
        this.barn = barn;
    }
}
