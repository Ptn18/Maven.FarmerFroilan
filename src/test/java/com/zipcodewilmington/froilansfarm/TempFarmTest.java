package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TempFarmTest {

    @Test
    public void farmConstructorTest() {
        Farm testFarm = new Farm();
        Assert.assertNotNull(testFarm.hashCode());
    }

    @Test
    public void getContainersTest() {
        Farm testFarm = new Farm();
        int expected = 0;
        Assert.assertEquals(expected, testFarm.getContainers().size());
    }

    @Test
    public void addContainersTest() {
        //Given
        Farm testFarm = new Farm();
        Container<Person> testHouse = new FarmHouse();

        //When
        testFarm.addContainer(testHouse);
        int expected = 1;

        //Then
        Assert.assertEquals(expected, testFarm.getContainers().size());
    }

    @Test
    public void createContainerTest() {
        //Given
        Farm testFarm = new Farm();
        FarmItems testItem = FarmItems.PERSON;

        //When
        testFarm.createContainer(testItem);
        int expected = 1;

        //Then
        Assert.assertEquals(expected, testFarm.getContainers().size());
    }
}
