package com.zipcodewilmington.froilansfarm;

public class CropRow extends Container<Crop> {
    Crop.Type typePlanted;

    public Crop.Type getTypePlanted() {
        return typePlanted;
    }

    public void setTypePlanted(Crop.Type typePlanted) {
        this.typePlanted = typePlanted;
    }
}
