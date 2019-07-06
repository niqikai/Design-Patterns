package com.demo.strategy;




public class GreenHeadDuck extends Duck  {

    public GreenHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm green head duck");
    }


}
