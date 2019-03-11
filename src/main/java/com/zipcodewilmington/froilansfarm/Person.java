package com.zipcodewilmington.froilansfarm;

public abstract class Person extends Animal{
    private String name;
    private Integer age;
    private Integer id;
    
    public Person(String name, Integer age, Integer id) {
        super(name, age, id);
    }
    
    public Person(){
        name = "MacDonald";
        age = 60;
        id = 1;
    }
    
    @Override
    public void eat(Edible food) {

    }
    
    public void create(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String makeNoise() {
    return null;
    }

}
