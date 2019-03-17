package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Containers.Container;
import com.zipcodewilmington.froilansfarm.Containers.FarmHouse;
import com.zipcodewilmington.froilansfarm.Containers.Stable;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    
    @Test
    public void getSpecificContainersTest() {
        //Given
        Farm testFarm = new Farm();
        testFarm.createContainer(FarmItems.PERSON);
        testFarm.createContainer(FarmItems.CHICKEN);
        testFarm.createContainer(FarmItems.HORSE);
        testFarm.createContainer(FarmItems.CHICKEN);
        
        //When
        List<Container> chickenCoops = testFarm.getSpecificContainers(FarmItems.CHICKEN);
        int expected = 2;
        int actual = chickenCoops.size();
        
        //Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    @Ignore
    public void resetFlagsTest() {
        //Given
        Farm farmTest = new Farm();
        Stable stable = new Stable();
        ArrayList<Stable> stabled = new ArrayList<>();
        farmTest.addStables(stabled);
        Horse horse = new Horse("Mr. Ed", 1, 2);
        horse.setHasBeenRidden(true);
        stable.store(horse);
        System.out.println(stable.numberHolding());
        //When
        farmTest.resetFlags();
        //Then
        Assert.assertFalse(horse.getHasBeenRidden());
    }
}
