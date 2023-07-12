package io.zipcoder.polymorphism;

import junit.framework.TestCase;

public class DuckTest extends TestCase {

    public void testSpeak() {
        //Given
        Duck duck = new Duck("Jack");
        String expected = "I'mma Duck";
        //When
        String actual = duck.speak();
        //Then
        assertEquals(expected, actual);
    }
}