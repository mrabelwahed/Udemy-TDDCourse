package com.example.ramadan.mockito;

import com.example.ramadan.tdd_course.mockito.Person;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class AnnotationMockingTest {

    @Mock
    Person person;


    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }



}
