package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class CropRow extends Container<Crop> {
    Crop.Type typePlanted;

    public Crop.Type getTypePlanted() {
        return typePlanted;
    }

    public void setTypePlanted(Crop.Type typePlanted) {
        this.typePlanted = typePlanted;
    }
}
