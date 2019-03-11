package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PilotTest {
    Pilot pilot = new Pilot("Froilanda", 25, 1);
    Crop crop;
    CropRow cropRow1 = new CropRow();
    Silo silo = new Silo();
    Cropduster cropduster = new Cropduster();
    Barn barn = new Barn();
    Potato potato;
    
    @Test
    public void eatTest() {
        //Given
        Integer expectedInt = 0;
        pilot.setSilo(silo);
        silo.store(potato);
        //When
        pilot.eat(potato);
        //Then
        Assert.assertEquals(expectedInt, silo.numberHolding());
    }
    
    @Test
    public void mountTest() {
        //Given
        FarmVehicle cropduster = new Cropduster();
        Integer expectedInteger = 0;
        pilot.setBarn(barn);
        barn.store(cropduster);
        //When
        pilot.mount(cropduster);
        //Then
        Assert.assertEquals(expectedInteger, barn.numberHolding());
    }
    
/*    @Test
    @Ignore
    public void rideTest() {
        //Given
        //When
        //Then
    }*/
    
    @Test
    public void dismountTest() {
        //Given
        FarmVehicle cropduster = new Cropduster();
        Integer expectedInteger = 1;
        pilot.setBarn(barn);
        //When
        pilot.dismount(cropduster);
        //Then
        Assert.assertEquals(expectedInteger, barn.numberHolding());
    }
    
    @Test
    public void makeNoiseTest() {
        //Given
        String expectedString = "Weee!";
        //When
        String actualString = pilot.makeNoise();
        //Then
        Assert.assertEquals(expectedString, actualString);
    }
    
    @Test
    public void flyTest() {
        //Given
        Cropduster cropduster = new Cropduster();
        String expectedString = "I'm cropdustin'!";
        //When
        String actualString = pilot.fly(cropduster);
        //Then
        Assert.assertEquals(expectedString, actualString);
    }
}
