package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
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

    @Test
    public void plantFieldTest() {
        //Given
        Farm testFarm = new Farm();
        testFarm.createContainer(FarmItems.CROPROW);

        //When
        FarmFactory.plantField(testFarm);
        List<Container> fields = testFarm.getSpecificContainers(FarmItems.CROPROW);
        Container testRow = fields.get(0);
        Enum expected = Crop.Type.CORNSTALK;
        Enum actual = testRow.getContains();


    }
}
