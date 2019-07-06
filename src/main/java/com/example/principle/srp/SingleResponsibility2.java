package com.example.principle.srp;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("car");
        // ... ...
    }

}


class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " running in road");
    }
}


class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " running in sky");
    }
}


class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " running in sea");
    }
}