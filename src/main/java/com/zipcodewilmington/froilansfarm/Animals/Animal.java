package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Noisemaker;

public abstract class Animal implements AnimalFactory, Noisemaker {
//    public interface Animal extends Noisemaker, AnimalFactory{
    
    private String name;
    private Integer age;
    private Integer id;
    
    public Animal() {
    }
    
    public Animal(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public void eat(Edible food) {
    }
    
    public String makeNoise() {
        return "Zzz";
    }
    
    public void create(String name, Integer age, Integer id) {
    }
}
