package com.zipcodewilmington.froilansfarm.Containers;

import com.zipcodewilmington.froilansfarm.FarmItems;

import java.util.ArrayList;
import java.util.List;

public abstract class Container<TypeToBeStored> {
    private FarmItems contains;

    private List<TypeToBeStored> items;

    public Container(List<TypeToBeStored> items) {
        this.items = items;
        this.contains = null;
    }

    public Container() {
        this(new ArrayList<>());
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

    public FarmItems getContains() {
        return contains;
    }

    public void setContains(FarmItems contains) {
        this.contains = contains;
    }
}
