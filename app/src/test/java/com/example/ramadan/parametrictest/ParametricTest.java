package com.example.ramadan.parametrictest;


import com.example.ramadan.tdd_course.unittesting.Calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class ParametricTest {



    private int numberA;
    private int numberB;
    private int expected;

    public  ParametricTest(int a,int b, int expected){
        this.numberA = a;
        this.numberB = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public  static Collection<Object[]> dataset(){

        Object[][] data = new Object[][]{
                {1,2,3},
                {2,5,7},
                {20,6,26}
        };

        return Arrays.asList(data);
    }


    @Test
    public void testAddingTwoPositiveNumbers(){
        Calculator calculator = new Calculator();
          assertEquals(expected,calculator.add(numberA,numberB));
    }
}
