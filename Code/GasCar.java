package org.example;

public class GasCar extends Vehicle {

    public GasCar (Integer fuel) {
        super(fuel);
    }

    @Override
    public void move() {
        fuel -= this.fuelConsumption;
        System.out.println("Gas Car Moved! Fuel: " + fuel);
    }
}
