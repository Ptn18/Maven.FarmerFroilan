package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class WeeklyRoutineUtilities {




    public static Integer fertilizeField(Cropduster cropduster, Field field) {
        Integer cropsFertilized = 0;
        List<CropRow> cropRows = field.getItems();
        for (int i = 0; i < field.numberHolding() ; i++) {
            CropRow rowToFertilize = cropRows.get(i);
            cropsFertilized += fertilizeCrops(cropduster, rowToFertilize);
        }

        return cropsFertilized;
    }

    private static Integer fertilizeCrops(Cropduster cropduster, CropRow rowToFertilize) {
        Integer cropsFertilized = 0;
        List<Crop> crops = rowToFertilize.getItems();
        for (int i = 0; i < crops.size() ; i++) {
            Crop cropToFertilize = crops.get(i);
            cropsFertilized = cropduster.fertilize(cropToFertilize);;
        }

        return cropsFertilized;
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