package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Farm {
    private List<Container> containers;
    private Tractor tractor;
    private Cropduster cropduster;
    private Field field;
    private List<ChickenCoop> chickenCoops;
    private List<Stable>stables;


    public Farm() {
        containers = new ArrayList<>();
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void addContainer(Container container) {

        containers.add(container);
    }

    public void createContainer(FarmItems itemsToStore) {
        Container container = ContainerFactory.createContainer(itemsToStore);
        containers.add(container);
    }

    public void addTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    public void addCropduster(Cropduster cropduster) {
        this.cropduster = cropduster;
    }

    public void addField(Field field) {
        this.field = field;
    }

    public void addChickenCoop(List<ChickenCoop> coops) {
        this.chickenCoops = coops;
    }

    public void addStables(List<Stable> stable) {
        this.stables = stables;
    }


    public void run(){
        runMonday();


    }

    private void runMonday() {
        feedAndRideHorse();
        feedingHumans();
        
    }

    public void feedAndRideHorse() {
        for(int j = 0; j < stables.size(); j++){
            Stable stable = stables.get(j);
            List<Horse> horses = stable.getItems();
            for(int i = 0; i < horses.size(); i++){
                Horse horse = horses.get(i);
                horse.setHasBeenRidden(true);
                for(int k = 0; k <3; k++) {
                    EarCorn earCorn = new EarCorn();
                    horse.eat(earCorn);
                }
            }
        }
    }
    public void feedingHumans(){
        Farmer froilan = null;

        feedHuman(froilan, EarCorn::new, 1);
        feedHuman(froilan, Tomato::new, 2);
        feedHuman(froilan, Tomato::new, 2);


    }

    public void feedHuman(Farmer person, Supplier<Edible> supplier, int amount){
        for(int i = 0; i < amount; i++) {
            person.eat(supplier.get());
        }
    }
}

