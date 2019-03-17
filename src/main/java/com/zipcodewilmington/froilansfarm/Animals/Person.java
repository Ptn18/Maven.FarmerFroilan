package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmItems;

import java.util.List;

public abstract class Person extends Animal {
    private String name;
    private Integer age;
    private Integer id;
    
    public Person(String name, Integer age, Integer id) {
        super(name, age, id);
    }
    
    public Person() {
        name = "MacDonald";
        age = 60;
        id = 1;
    }
    
    public void eat(Edible food) {
    }
    
    public void create(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public String makeNoise() {
        return "Huh?";
    }

    public static List<Person> getPeople(Farm farm) {
        return farm.getSpecificContainers(FarmItems.PERSON).get(0).getItems();
    }

}
