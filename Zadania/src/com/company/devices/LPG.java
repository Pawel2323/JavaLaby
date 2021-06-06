package com.company.devices;


public class LPG extends Car {
    public LPG(String color, String model, String producer, double value, Integer yearOfProduction) {
        super(color, model, producer, value, yearOfProduction);
    }







    public void fuel() {
        System.out.println("Do pełna");
    }
}
