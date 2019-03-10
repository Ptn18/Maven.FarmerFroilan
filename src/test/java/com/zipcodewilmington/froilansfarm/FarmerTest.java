package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Crop.Type.POTATO_PLANT;

public class FarmerTest {
    Farmer farmer = new Farmer("Farmer Joe", 49, 2);
    Horse horse = new Horse("Harry Trotter", 20, 3);
    Crop crop;
    CropRow cropRow1 = new CropRow();
    Stable stable = new Stable();
    Silo silo = new Silo();
    
    @Test
    @Ignore
    public void eatTest() {
        //Given
        Integer expectedInt = 1;
        PotatoPlant potatoPlant = new PotatoPlant();
        potatoPlant.fertilized();
        Edible potato = potatoPlant.yield();
        farmer.setSilo(silo);
        farmer.storeEdible(potato);
        //When
        farmer.eat(potato);
        //Then
        Assert.assertEquals(expectedInt, silo.numberHolding());
    }
    
    @Test
    public void mountTest() {
        //Given
        Integer expectedInteger = 0;
        //When
        stable.store(horse);
        stable.remove(horse);
        //Then
        Assert.assertEquals(expectedInteger, stable.numberHolding());
    }
    
    @Test
    public void rideTest() {
        //Given
        horse.setHasBeenRidden(true);
        //When
        //Then
        Assert.assertTrue(horse.getHasBeenRidden());
    }
    
    @Test
    public void dismountTest() {
        //Given
        Integer expectedInteger = 1;
        //When
        stable.store(horse);
        //Then
        Assert.assertEquals(expectedInteger, stable.numberHolding());
        
    }
    
    @Test
    public void makeNoiseTest() {
        //Given
        //When
        //Then
    }
    
    @Test
    public void plantTest() {
        //Given
        Integer expectedInteger = 1;
        Crop potato = new PotatoPlant();
        //When
        farmer.plant(potato, cropRow1);
        //Then
        Assert.assertEquals(expectedInteger, cropRow1.numberHolding());
        
    }
    
    @Test
    public void storeEdibleTest() {
        //Given
        PotatoPlant potatoPlant = new PotatoPlant();
        potatoPlant.fertilized();
        Edible potato = potatoPlant.yield();
        Integer expectedInteger = 1;
        //When
        silo.store(potato);
        //Then
        Assert.assertEquals(expectedInteger, silo.numberHolding());
    }
}
