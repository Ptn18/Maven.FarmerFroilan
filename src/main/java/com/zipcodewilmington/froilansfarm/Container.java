package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public abstract class Container<TypeToBeStored> {
    private List<TypeToBeStored> items;

    public Container(List<TypeToBeStored> items) {
        this.items = items;
    }

    public Container() {
        this(new ArrayList<TypeToBeStored>());
    }

    public List<TypeToBeStored> getItems() {
        return items;
    }

    public void store(TypeToBeStored item) {
        items.add(item);
    }

    public TypeToBeStored getByIndex(Integer index) {
        return items.get(index);
    }

    public void remove(TypeToBeStored itemToBeRemoved) {
        items.remove(itemToBeRemoved);
    }

    public Integer numberHolding() {
        return items.size();
    }
}
