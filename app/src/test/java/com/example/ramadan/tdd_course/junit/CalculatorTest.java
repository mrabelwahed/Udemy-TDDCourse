package com.example.ramadan.tdd_course.junit;

import com.example.ramadan.tdd_course.unittesting.Calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public static void init(){
        System.out.println("@BeforeClass is called");
    }

    @Before
    public  void setup(){
         calculator = new Calculator();
         System.out.println("@Before is called");
    }

    @Test
    public  void testAddingTwoPositiveNumbers(){
        assertEquals(50,calculator.add(20,30));

    }


    @Test
    public  void testSubtractionForTwoPositiveNumbers(){
        assertEquals(20,calculator.subtract(30,10));

    }


    @Test
    public  void testMultiplicationForTwoPositiveNumbers(){
        assertEquals(300,calculator.multiply(30,10));

    }



    @Test
    public  void testDivisionByNonZeroNumber(){
        assertEquals(3,calculator.divide(30,10));

    }


    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public  void testDivisionByZeroNumber(){
        assertEquals(3,calculator.divide(30,0));

    }

    @After
    public void teardown(){
        calculator = null;
        System.out.println("@After is called");
    }

    @AfterClass
    public  static void close(){
        System.out.println("@AfterClass is called");
    }

}
