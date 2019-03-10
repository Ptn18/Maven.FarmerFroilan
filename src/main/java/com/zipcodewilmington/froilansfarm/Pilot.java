package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person implements Rider{
    
    private String name;
    private Integer age;
    private Integer id;
    Silo silo;
    
    public Pilot(){
        name = "Froilanda";
        age = 25;
        id = 1;
    }
    
    public Pilot(String name, Integer age, Integer id) {
        super(name, age, id);}
    
    public void eat(Edible food) {
        silo.remove(food);
    }

    public String makeNoise() {
        return "Weee!";
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
