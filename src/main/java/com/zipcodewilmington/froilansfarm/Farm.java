package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Container> containers;

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

}
