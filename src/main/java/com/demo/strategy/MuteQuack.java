package com.demo.strategy;

import com.demo.strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MuteQuack... ...");
    }
}
