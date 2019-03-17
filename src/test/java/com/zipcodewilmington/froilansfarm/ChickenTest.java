package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Containers.Silo;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    Chicken chicken = new Chicken("Clucky Brewster", 2, 1);
    Silo silo = new Silo();
    Edible potato;
    

    @Test
    public void eatTest() {
        //Given
        Integer expectedInt = 0;
        chicken.setSilo(silo);
        silo.store(potato);
        //When
        chicken.eat(potato);
        //Then
        Assert.assertEquals(expectedInt, silo.numberHolding());
    }
    
    @Test
    public void yieldTest(){
        //Given
        //When
        Edible actual = chicken.yield();
        //Then
        Assert.assertNotNull(actual);
    }
    
    @Test
    public void yieldTest2(){
        //Given
        Edible edibleEgg = new EdibleEgg();
        //When
        Edible actual = chicken.yield();
        Assert.assertTrue(actual instanceof EdibleEgg);
        //Then
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
