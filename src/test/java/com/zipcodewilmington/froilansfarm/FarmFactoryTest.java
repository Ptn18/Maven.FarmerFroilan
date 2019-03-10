package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class FarmFactoryTest {


    @Test
    public void createContainersTest() {
        //Given
        Farm froilanFarm = new Farm();
        FarmItems[] containersToCreate = new FarmItems[]{
            FarmItems.PERSON,
            FarmItems.CROPROW,
            FarmItems.CHICKEN,
            FarmItems.CHICKEN,
            FarmItems.CHICKEN,
            FarmItems.CHICKEN,
            FarmItems.HORSE,
            FarmItems.HORSE,
            FarmItems.HORSE,
            FarmItems.VEHICLE,
            FarmItems.EDIBLE
        };

        //When
        FarmFactory createFarm = new FarmFactory();
        createFarm.createContainers(froilanFarm,containersToCreate );
        int expected = 11;
        int actual = froilanFarm.getContainers().size();

        //Then
        Assert.assertEquals(expected, actual);


    }
}
