package io.zipcoder.polymorphism;

import junit.framework.TestCase;

public class DogTest extends TestCase {

    public void testSpeak() {
        //Given
        Dog dog = new Dog("Jack");
        String expected = "Bark!";
        //When
        String actual = dog.speak();
        //Then
        assertEquals(expected, actual);
    }
}