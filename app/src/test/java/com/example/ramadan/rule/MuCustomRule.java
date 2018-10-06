package com.example.ramadan.rule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.logging.Logger;

public class MuCustomRule implements TestRule{

    Logger logger;

    public Logger getLogger(){
        return logger;
    }

    @Override
    public Statement apply(Statement base, Description description) {

        logger = Logger.getLogger(MuCustomRule.class.getSimpleName()+": this is my custom rule");

        try {
            base.evaluate();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return base;
    }
}
