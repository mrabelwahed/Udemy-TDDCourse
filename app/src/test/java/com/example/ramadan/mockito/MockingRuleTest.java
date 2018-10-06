package com.example.ramadan.mockito;

import com.example.ramadan.tdd_course.mockito.Person;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class MockingRuleTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Person person;


}
