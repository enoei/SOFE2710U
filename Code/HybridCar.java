package org.example;

public class HybridCar extends Vehicle {

    protected  Integer electric;
    protected  Integer electricConsumption;

    public HybridCar (Integer fuel) {
        super(fuel);
        this.electric = 100;
        this.electricConsumption = 1;
    }

    @Override
    public void move() {
        this.fuel -= this.fuelConsumption;
        this.electric -= this.electricConsumption;

        System.out.println("Hybrid Car Moved! Fuel: " + fuel + " Electric: " + electric);
    }
}
