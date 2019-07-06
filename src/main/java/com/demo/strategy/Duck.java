package com.demo.strategy;

import com.demo.strategy.interfaces.FlyBehavior;
import com.demo.strategy.interfaces.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }



    public void swim() {
        System.out.println("All duck can swim... ...");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
