package com.demo.strategy;

import com.demo.strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyWithWings... ...");
    }
}
