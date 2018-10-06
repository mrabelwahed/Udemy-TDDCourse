package com.example.ramadan.spytesting;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

public class SpyListTest {

    @Test
    public  void  testSpyArrsyList(){
        List<String> orignalList = new ArrayList<>();
        List<String> spyList = Mockito.spy(orignalList);

        spyList.add("Python programming");
        spyList.add("Kotlin programming");


        Mockito.verify(spyList).add("Python programming");
        Mockito.verify(spyList).add("Kotlin programming");

        assertEquals(2,spyList.size());
    }




    @Test
    public  void  testMockArrayList(){
        List<String> mocklist = Mockito.mock(ArrayList.class);

        mocklist.add("Python programming");
        mocklist.add("Kotlin programming");


        Mockito.verify(mocklist).add("Python programming");
        Mockito.verify(mocklist).add("Kotlin programming");

        assertEquals(2,mocklist.size());
    }



    @Test
    public  void  testSpyStub(){
        List<String> orignalList = new ArrayList<>();
        List<String> spyList = Mockito.spy(orignalList);

        assertEquals(0,spyList.size());

        when(spyList.size()).thenReturn(100);

        assertEquals(100,spyList.size());
    }




}
