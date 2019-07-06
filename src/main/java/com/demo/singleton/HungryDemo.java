package com.demo.singleton;

/**
 * 饿汉模式
 */
public class HungryDemo {

    private static HungryDemo instance = new HungryDemo();

    public static HungryDemo getInstance() {
        return instance;
    }

    private HungryDemo(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        HungryDemo demo = HungryDemo.getInstance();
        HungryDemo instance = HungryDemo.getInstance();
    }
}
