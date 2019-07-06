package com.demo.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
