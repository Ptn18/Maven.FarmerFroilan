package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TempContainerFactoryTest {

    @Test
    public void createContainerTest() {

        //Given
        FarmItems toStore = FarmItems.CHICKEN;

        //When
        Container coop = ContainerFactory.createContainer(toStore);
        String expected = "class com.zipcodewilmington.froilansfarm.ChickenCoop";
        String actual = coop.getClass().toString();

        //Then
        Assert.assertEquals(expected, actual);



    }
}
