package com.company.devices;
import com.company.Human;
public class Phone extends Devices {
    final public Double screenSize;
    final public String System;
    public Phone(String model, String producer, Integer yearofproduction, Double screenSize, String System) {
        super(model, producer, yearofproduction);
        this.screenSize = screenSize;
        this.System = System;
    }

    public void turnOn() {
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }


}