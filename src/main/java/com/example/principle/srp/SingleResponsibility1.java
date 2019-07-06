package com.example.principle.srp;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("car");
        vehicle.run("bike");
        vehicle.run("plane");
    }

}


class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " running in road");
    }
}