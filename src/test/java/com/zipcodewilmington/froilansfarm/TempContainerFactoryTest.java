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

        //Then
        Assert.assertTrue(coop instanceof ChickenCoop);
    }
}
