package com.zipcodewilmington.froilansfarm.Edibles;


public class EdibleFactory {
    public static Edible create(Crop.Type type) {
        switch (type) {
            case CORNSTALK:
                return new EarCorn();
            case POTATO_PLANT:
                return new Potato();
            default:
                return new Tomato();

        }
    }
}
