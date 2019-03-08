package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Container<TypeToBeStored> {
    private List<TypeToBeStored> items;

    public Container(List<TypeToBeStored> items) {
        this.items = items;
    }

    public Container() {
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
