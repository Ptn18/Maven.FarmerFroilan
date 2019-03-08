package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Structure> structures;

    public Farm() {
        structures = new ArrayList<Structure>();
    }

    public void addStructure(Structure structure) {

        structures.add(structure);
    };

}
