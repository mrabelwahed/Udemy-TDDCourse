package com.example.ramadan.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FirstRuleTest {

    @Rule
    public Timeout timeout = new Timeout(2000);

    @Test
    public void testA() throws Exception{

    }

    @Test
    public void testB() throws Exception{

    }

    @Test
    public void testC() throws Exception{

    }
}
