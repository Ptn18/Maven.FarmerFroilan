package com.zipcodewilmington.froilansfarm.Containers;

import com.zipcodewilmington.froilansfarm.Edibles.Crop;

public class CropRow extends Container<Crop> {
    Crop.Type typePlanted;

    public Crop.Type getTypePlanted() {
        return typePlanted;
    }

    public void setTypePlanted(Crop.Type typePlanted) {
        this.typePlanted = typePlanted;
    }
}
