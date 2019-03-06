package com.zipcodewilmington.froilansfarm;

public class Field extends Storehouse {
    @Override
    void store(String item) {
        super.store(item);
    }

    private CropRow cropRow = new CropRow();
}
