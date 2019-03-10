package com.zipcodewilmington.froilansfarm;

import static com.zipcodewilmington.froilansfarm.AnimalFactory.AnimalType.HORSE;
import static com.zipcodewilmington.froilansfarm.AnimalFactory.AnimalType.CHICKEN;

public class AnimalFactoryDemo {
    private final AnimalFactory animalFactory;
    
    public AnimalFactoryDemo(AnimalFactory animalFactory) {
        this.animalFactory = animalFactory;
    }
    
    public static void main(String[] args) {
        // first: static factory method example
        AnimalFactory.createFactory(HORSE).create("Mr. Ed", 12, 1);
        
        // second: inject factory into application and use later on
        AnimalFactory factory = AnimalFactory.createFactory(CHICKEN);
        
        AnimalFactoryDemo demo = new AnimalFactoryDemo(factory);
        demo.create("Mr Ed", 12, 2);
        demo.speak("I'm Mr. Ed!");
        
        System.out.println(factory.toString());
        
        AnimalFactory horse = AnimalFactory.createFactory(HORSE);
        
    }
    
    void create(String name, Integer age, Integer id) {
        animalFactory.create(name, age, id);
        
    }
    
    private void speak(String word){
        System.out.println(word);
    }
}