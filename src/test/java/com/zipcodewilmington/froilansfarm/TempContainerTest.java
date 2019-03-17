package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Person;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.Containers.Container;
import com.zipcodewilmington.froilansfarm.Containers.FarmHouse;
import org.junit.Assert;
import org.junit.Test;

public class TempContainerTest {

    @Test
    public void constructorTest() {

        //When
        Container<Person> house = new FarmHouse();

        //Then
        Assert.assertNotNull(house);
    }

    @Test
    public void getItemsTest() {
        //Given
        Container<Person> house = new FarmHouse();

        //When
        int expected = 0;

        Assert.assertEquals(expected, house.getItems().size());
    }

    @Test
    public void storeTest() {
        //Given
        Container<Person> house = new FarmHouse();
        Person testPerson = new Farmer("Farmer Joe", 48, 2);

        //When
        house.store(testPerson);
        int expected = 1;

        //Then
        Assert.assertEquals(expected, house.getItems().size());
    }

    @Test
    public void getByIndexTest() {
        //Given
        Container<Person> house = new FarmHouse();
        Person testPerson = new Farmer("Farmer Ted", 88, 4);
        Person testPerson2 = new Pilot("Froilanda the Wonder Twin", 39, 2);

        //When
        house.store(testPerson);
        house.store(testPerson2);
        Person expected = testPerson2;

        //Then
        Assert.assertEquals(expected, house.getByIndex(1));
    }

    @Test
    public void removeTest() {
        //Given
        Container<Person> house = new FarmHouse();
        Person testPerson = new Farmer("Farmer Joe", 49, 2);
        Person testPerson2 = new Pilot("Froilanda", 39, 3);

        //When
        house.store(testPerson);
        house.store(testPerson2);
        Assert.assertEquals(2, house.getItems().size());
        house.remove(testPerson);

        //Then
        Assert.assertEquals(1, house.getItems().size());
    }

    @Test
    public void sizeTest() {
        //Given
        Container<Person> house = new FarmHouse();
        Person testPerson = new Farmer("Farmer Joe", 49, 2);

        //When
        house.store(testPerson);
        Integer expected = 1;
        Integer actual = house.numberHolding();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setContainsTest() {
        //Given
        Container<Person> house = new FarmHouse();

        //When
        house.setContains(FarmItems.PERSON);

        //Then
        Assert.assertNotNull(house.getContains());

    }

    @Test
    public void getContainsTest() {
        //Given
        Container<Person> house = new FarmHouse();
        house.setContains(FarmItems.PERSON);

        //When
        FarmItems expected = FarmItems.PERSON;
        FarmItems actual = house.getContains();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
