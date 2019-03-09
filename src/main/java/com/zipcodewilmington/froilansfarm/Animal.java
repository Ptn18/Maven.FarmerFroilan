package com.zipcodewilmington.froilansfarm;

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
    
    public void create(String name, Integer age, Integer id) {
    }
}
