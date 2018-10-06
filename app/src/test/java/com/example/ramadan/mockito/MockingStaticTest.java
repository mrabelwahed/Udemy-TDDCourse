package com.example.ramadan.mockito;

import com.example.ramadan.tdd_course.mockito.Person;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class MockingStaticTest {

    @Test
    public void testPerson(){
        Person person = mock(Person.class);
    }
}
