package com.example.factory.simple;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("greek pizza preparing");
    }
}
