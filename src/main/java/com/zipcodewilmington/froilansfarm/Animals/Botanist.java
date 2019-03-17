package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Containers.CropRow;
import com.zipcodewilmington.froilansfarm.Edibles.Crop;

public interface Botanist {
    
    void plant(Crop crop, CropRow rowNumber);
    
}