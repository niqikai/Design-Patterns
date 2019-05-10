package com.demo;

import com.demo.strategypattern.Duck;
import com.demo.strategypattern.FlyWithWings;
import com.demo.strategypattern.ModelDuck;

/**
 * Hello world!
 *
 */
public class App {

    
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Duck model = new ModelDuck();

        model.performFly();

        model.setFlyBehavior(new FlyWithWings());

        model.performFly();


    }
}
