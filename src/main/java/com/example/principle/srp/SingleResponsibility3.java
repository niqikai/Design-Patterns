package com.example.principle.srp;

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();

        vehicle2.runRoad("car");
        vehicle2.runAir("plane");
    }

}


class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + " running in road");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + " running in air");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + " running in water");
    }
}

