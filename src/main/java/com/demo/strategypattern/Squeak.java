package com.demo.strategypattern;

import com.demo.strategypattern.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak... ...");
    }
}
