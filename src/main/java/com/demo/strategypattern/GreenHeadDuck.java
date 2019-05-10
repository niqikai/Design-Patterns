package com.demo.strategypattern;

import com.demo.strategypattern.interfaces.FlyBehavior;

public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm green head duck");
    }



}
