package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Containers.Silo;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    Horse horse = new Horse("Harry Trotter", 10, 5);
    Edible potato;
    Silo silo = new Silo();
    
    @Test
    public void eatTest() {
        //Given
        Integer expectedInt = 0;
        horse.setSilo(silo);
        silo.store(potato);
        //When
        horse.eat(potato);
        //Then
        Assert.assertEquals(expectedInt, silo.numberHolding());
    }
    
    @Test
    public void makeNoiseTest() {
        //Given
        String expectedString = "Neigh!";
        //When
        String actualString = horse.makeNoise();
        //Then
        Assert.assertEquals(expectedString, actualString);
    }
    
    @Test
    public void instanceOfAnimalTest() {
        //Given
        boolean actualBoolean = horse instanceof Animal;
        //When
        //Then
        Assert.assertTrue(actualBoolean);
    }
    
    @Test
    public void getHasBeenRiddenTest() {
        //Given
        horse.setHasBeenRidden(true);
        // When
        boolean actualFlag = horse.getHasBeenRidden();
        // Then
        Assert.assertTrue(actualFlag);
    }
    
    @Test
    public void setHasBeenRiddenTest() {
        //Given
        boolean expectedBoolean = false;
        //When
        horse.setHasBeenRidden(false);
        //Then
        Assert.assertEquals(expectedBoolean, horse.getHasBeenRidden());
    }
}
