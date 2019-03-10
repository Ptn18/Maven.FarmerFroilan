package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ChickenTest {
    Chicken chicken = new Chicken("Clucky Brewster", 2, 1);
    Silo silo = new Silo();
    Edible potato;
    
    @Test
    @Ignore
    public void eatTest() {
        //Given
        Integer expectedInt = 0;
        silo.storeEdible(potato);
        //When
        chicken.eat(potato);
        //Then
        Assert.assertEquals(expectedInt, silo.numberHolding());
    }
    
    @Test
    public void makeNoiseTest() {
        //Given
        String expectedString = "Cluck!";
        //When
        String actualString = chicken.makeNoise();
        //Then
        Assert.assertEquals(expectedString, actualString);
    }
    
    @Test
    public void instanceOfAnimalTest() {
        //Given
        boolean actualBoolean = chicken instanceof Animal;
        //When
        //Then
        Assert.assertTrue(actualBoolean);
    }
    
    @Test
    public void getHasBeenFertilizedTest() {
        //Given
        chicken.setHasBeenFertilized(true);
        // When
        boolean actualFlag = chicken.hasBeenFertilized();
        // Then
        Assert.assertTrue(actualFlag);
    }
    
    @Test
    public void setHasBeenFertilizedTest() {
        //Given
        boolean expectedBoolean = false;
        //When
        chicken.setHasBeenFertilized(false);
        //Then
        Assert.assertEquals(expectedBoolean, chicken.hasBeenFertilized());
    }
}
