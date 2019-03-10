package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

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

    public void addTracker(Tractor tractor) {
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
}

