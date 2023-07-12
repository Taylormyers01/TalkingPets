package io.zipcoder.polymorphism;

import junit.framework.TestCase;

public class CatTest extends TestCase {

    public void testSpeak() {
        //Given
        Cat cat = new Cat("Jack");
        String expected = "Meow!";
        //When
        String actual = cat.speak();
        //Then
        assertEquals(expected, actual);
    }
}