package com.example.ramadan.rule;

import org.junit.Rule;
import org.junit.Test;

public class MyRuleTest {

    @Rule
    public  MuCustomRule mycustomRule = new MuCustomRule();


    @Test
    public  void testWarningMsg(){
        mycustomRule.getLogger().warning("very bad problem");
    }
}
