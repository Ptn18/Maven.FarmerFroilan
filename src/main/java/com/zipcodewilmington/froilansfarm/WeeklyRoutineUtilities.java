package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class WeeklyRoutineUtilities {



public static void harvestCrops(Farm farm){
    Farmer froilan = Farmer.getFarmer(farm);
    froilan.makeNoise();
    Tractor tractor = Tractor.getTractor(farm);
    froilan.mount(tractor);
    tractor.operate(farm);
    froilan.dismount(tractor);
}

public static void fertilizeField(Farm farm) {
    Pilot froilanda = Pilot.getPilot(farm);
    Cropduster plane = Cropduster.getCropduster(farm);
    froilanda.mount(plane);
    plane.operate(farm);
    froilanda.dismount(plane);
}


}


//    As a farmer, Froilan must stick to a rigorous agricultural routine.
//        Every morning, Froilan and Froilanda begin their morning by
//
//        Riding each Horse in each Stable.
//        Feeding each Horse 3 ear of Corn.
//        For breakfast,
//        Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
//        Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
//        Sunday, Froilan plants 3 different type of Crop in his first, second, and third CropRow.
//
//        On Monday, his sister, Froilanda uses the CropDuster to fly over the Field and fertilize each of the CropRow
//
//        On Tuesday, Froilan uses his Tractor to harvest each Crop in each CropRow.