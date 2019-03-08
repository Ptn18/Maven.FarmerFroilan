package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Storehouse<TypeToBeStored> implements Structure {
    private List<TypeToBeStored> items;

    public Storehouse(List<TypeToBeStored> items) {
        this.items = items;
    }

    public Storehouse() {
        this(new ArrayList<TypeToBeStored>());
    }

    public void store(TypeToBeStored item) {
        items.add(item);
    }

    public TypeToBeStored get(Integer index) {
        return items.get(index);
    }

    public void remove(TypeToBeStored itemToBeRemoved) {
        items.remove(itemToBeRemoved);
    }

    public Integer size() {
        return items.size();
    }
}
