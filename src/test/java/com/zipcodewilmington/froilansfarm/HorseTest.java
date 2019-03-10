package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HorseTest {
    Horse horse = new Horse("Harry Trotter", 10, 5);
    //Container container = new Container();
    private Edible food;
    
    @Test
    @Ignore
    public void eatTest(){
        //Given
        Integer expectedInt = 0;
        //container.store(food);
        //When
        horse.eat(food);
        //Then
        //Assert.assertEquals(expectedInt, container.size());
    }
    
    @Test
    public void makeNoiseTest(){
        //Given
        String expectedString = "Neigh!";
        //When
        String actualString = horse.makeNoise();
        //Then
        Assert.assertEquals(expectedString, actualString);
    }
    
    @Test
    public void instanceOfAnimalTest(){
        //Given
        boolean actualBoolean = horse instanceof Animal;
        //When
        //Then
        Assert.assertTrue(actualBoolean);
    }
    
    @Test
    public void getHasBeenRiddenTest(){
        //Given
        horse.setHasBeenRidden(true);
        // When
        boolean actualFlag = horse.getHasBeenRidden();
        // Then
        Assert.assertTrue(actualFlag);
    }
    
    @Test
    public void setHasBeenRiddenTest(){
        //Given
        boolean expectedBoolean = false;
        //When
        horse.setHasBeenRidden(false);
        //Then
        Assert.assertEquals(expectedBoolean, horse.getHasBeenRidden());
    }
}
