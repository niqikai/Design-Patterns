package com.demo.strategypattern;

import com.demo.strategypattern.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyNoWay... ...");
    }
}
