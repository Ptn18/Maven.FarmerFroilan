package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Containers.Silo;
import com.zipcodewilmington.froilansfarm.Containers.Stable;
import com.zipcodewilmington.froilansfarm.Edibles.Crop;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.PotatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {
    Farmer farmer = new Farmer("Farmer Joe", 49, 2);
    CropRow cropRow1 = new CropRow();
    Stable stable = new Stable();
    Silo silo = new Silo();
    Barn barn = new Barn();
    
    @Test
    public void eatTest() {
        //Given
        Integer expectedInt = 0;
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
    public void mountHorseTest() {
        //Given
        Horse horse = new Horse("A", 1, 2);
        Integer expectedInteger = 0;
        farmer.setStable(stable);
        stable.store(horse);
        //When
        farmer.mount(horse);
        //Then
        Assert.assertEquals(expectedInteger, stable.numberHolding());
    }
    
    @Test
    public void mountTractorTest() {
        //Given
        FarmVehicle tractor = new Tractor();
        Integer expectedInteger = 0;
        farmer.setBarn(barn);
        barn.store(tractor);
        //When
        farmer.mount(tractor);
        //Then
        Assert.assertEquals(expectedInteger, barn.numberHolding());
    }
    
    @Test
    public void dismountHorseTest() {
        //Given
        Horse horse = new Horse("A", 1, 2);
        Integer expectedInteger = 1;
        farmer.setStable(stable);
        //When
        farmer.dismount(horse);
        //Then
        Assert.assertEquals(expectedInteger, stable.numberHolding());
        
    }
    
    @Test
    public void dismountTractorTest() {
        //Given
        FarmVehicle tractor = new Tractor();
        Integer expectedInteger = 1;
        farmer.setBarn(barn);
        //When
        farmer.dismount(tractor);
        //Then
        Assert.assertEquals(expectedInteger, barn.numberHolding());
        
    }
    
    @Test
    public void makeNoiseTest() {
        //Given
        String expectedString = "Hmmm";
        //When
        String actualString = farmer.makeNoise();
        //Then
        Assert.assertEquals(expectedString, actualString);
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
