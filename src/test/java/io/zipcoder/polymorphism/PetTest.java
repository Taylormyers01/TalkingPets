package io.zipcoder.polymorphism;

import junit.framework.TestCase;

public class PetTest extends TestCase {

    public void testSpeak() {
        //Given
        Pet pet = new Pet("Jack");
        String expected = "Sup, I'mma pet";
        //When
        String actual = pet.speak();
        //Then
        assertEquals(expected, actual);

    }

    public void testTestGetName() {
        //Given
        Pet pet = new Pet("Jack");
        String expected = "Jack";
        //When
        String actual = pet.getName();
        //Then
        assertEquals(expected, actual);

    }

    public void testTestSetName() {
        //Given
        Pet pet = new Pet("Jack");
        String expected = "Nick";
        //When
        pet.setName(expected);
        String actual = pet.getName();
        //Then
        assertEquals(expected, actual);

    }
}