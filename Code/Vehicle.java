package org.example;

public class Vehicle {

    protected Integer fuel;
    protected Integer fuelConsumption;

    public Vehicle(Integer fuel) {
        this.fuel = fuel;
        this.fuelConsumption = 10;
    }
    public void move() {
        this.fuel -= this.fuelConsumption;
        System.out.println("Vehicle Moved!");
    }
}

