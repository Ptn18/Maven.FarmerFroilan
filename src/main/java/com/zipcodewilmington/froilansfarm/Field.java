package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field implements Structure {

    private ArrayList<Crop> field;

    public Field() {
        this.field = new ArrayList<Crop>();
    }

    public void addCropRow(Crop crop) {
        field.add(crop);
    }



//    void store(CropRow item) {
//        super.store(item);
//    }
//
//    private CropRow cropRow = new CropRow();
}
