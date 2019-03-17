package com.zipcodewilmington.froilansfarm.Animals;

@FunctionalInterface
public interface AnimalFactory {
    enum AnimalType {
        FARMER(Farmer::new),
        PILOT(Pilot::new),
        HORSE(Horse::new),
        CHICKEN(Chicken::new);
        
        private final AnimalFactory constructor;
        
        AnimalType(AnimalFactory constructor) {
            this.constructor = constructor;
        }
        
        private AnimalFactory getConstructor() {
            return this.constructor;
        }
    }
    
    void create(String name, Integer age, Integer id);
    
    static AnimalFactory createFactory(AnimalType species) {
        return species.getConstructor();
    }
}
