package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Containers.Container;
import com.zipcodewilmington.froilansfarm.Containers.Stable;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Farm {
    private List<Container> containers;
    private List<Stable> stables;
    
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
    
    public void addStables(List<Stable> stable) {
        this.stables = stable;
    }
    
    public List<Container> getSpecificContainers(FarmItems typeToGet) {
        List<Container> allContainers = this.getContainers();
        List<Container> filteredContainerList = new ArrayList();
        for (int i = 0; i < allContainers.size(); i++) {
            Container thisContainer = allContainers.get(i);
            if (typeToGet == thisContainer.getContains()) {
                filteredContainerList.add(thisContainer);
            }
        }
        return filteredContainerList;
    }
    
    public void run() {
        runSundayOrWednesday();
        runMondayOrThursday();
        runTuesdayOrFriday();
        runSaturday();
    }
    
    private void runSundayOrWednesday() {
        //plantRoutine();
        dailyRoutine();
    }
    
    private void runMondayOrThursday() {
        //fertilizeRoutine();
        dailyRoutine();
    }
    
    private void runTuesdayOrFriday() {
        //harvestRoutine();
        dailyRoutine();
    }
    
    private void runSaturday() {
        dailyRoutine();
    }
    
    private void dailyRoutine() {
        //feedAndRideHorse();
        rideHorse();
        feedHorses();
        feedingHumans();
        resetFlags();
    }
    
/*
    private void plantRoutine(){}
    
    private void fertilizeRoutine(){}
    
    private void harvestRoutine(){}
*/
    
    public void resetFlags() {
        for (int j = 0; j < stables.size(); j++) {
            Stable stable = stables.get(j);
            List<Horse> horses = stable.getItems();
            for (Horse h : horses) {
                h.setHasBeenRidden(false);
            }
        }
    }
    
    /*public void feedAndRideHorse() {
        for (int j = 0; j < stables.size(); j++) {
            Stable stable = stables.get(j);
            List<Horse> horses = stable.getItems();
            for (int i = 0; i < horses.size(); i++) {
                Horse horse = horses.get(i);
                horse.setHasBeenRidden(true);
                for (int k = 0; k < 3; k++) {
                    EarCorn earCorn = new EarCorn();
                    horse.eat(earCorn);
        }
    }
        }
    }*/
    
    public Horse findHorse() {
        Horse horsey = new Horse("A", 1, 1);
        for (int j = 0; j < stables.size(); j++) {
            Stable stable = stables.get(j);
            List<Horse> horses = stable.getItems();
            for (int i = 0; i < horses.size(); i++) {
                horsey = horses.get(i);
            }
        }
        return horsey;
    }
    
    public void rideHorse() {
        findHorse().setHasBeenRidden(true);
    }
    
    public void feedHorses() {
        Horse horse = findHorse();
        for (int k = 0; k < 3; k++) {
            EarCorn earCorn = new EarCorn();
            horse.eat(earCorn);
        }
    }
    
    public void feedingHumans() {
        Farmer froilan = null;
        
        feedHuman(froilan, EarCorn::new, 1);
        feedHuman(froilan, Tomato::new, 2);
        feedHuman(froilan, Tomato::new, 2);
    }
    
    public void feedHuman(Farmer person, Supplier<Edible> supplier,
                          int amount) {
        for (int i = 0; i < amount; i++) {
            person.eat(supplier.get());
        }
    }
}