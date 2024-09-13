package org.example;

public class Main {

    public static void main(String[] args) {

        Vehicle gasCar = new GasCar(100);

        Vehicle hybridCar = new HybridCar(100);

        Vehicle[] vehicles = {gasCar, hybridCar};

        for(Vehicle v : vehicles) {
            v.move();
        }

    }
}