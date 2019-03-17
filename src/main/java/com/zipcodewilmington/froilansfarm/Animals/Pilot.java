package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Containers.Barn;
import com.zipcodewilmington.froilansfarm.Containers.Silo;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Rideable;

import java.util.List;

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
        makeNoise();
    }
    
    public void dismount(Rideable transport) {
        makeNoise();
    }
    
    public String fly(Aircraft aircraft) {
        return "I'm cropdustin'!";
    }
    
    public void setSilo(Silo silo) {
        this.silo = silo;
    }
    
    public void setBarn(Barn barn) {
        this.barn = barn;
    }

    public static Pilot getPilot(Farm farm) {
        List<Person> people = Person.getPeople(farm);
        Pilot pilot = null;
        for (Person person : people) {
            if(person instanceof Pilot) {
                pilot = (Pilot) person;
            }
        }
        return pilot;
    }
}
