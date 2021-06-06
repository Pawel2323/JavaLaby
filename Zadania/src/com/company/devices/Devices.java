package com.company.devices;

import com.company.Human;
import com.company.Selleable;

public abstract  class Devices implements Selleable {
    public final String model;
    public final String producer;
    public final Integer yearofproduction;
    public Devices(String model, String producer, Integer yearofproduction) {
        this.model = model;
        this.producer = producer;
        this.yearofproduction = yearofproduction;
    }
    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearofproduction=" + yearofproduction +
                '}';
    }
    public void turnOn() {
        System.out.println("Włączono urządzenie");
    }

    public abstract void sell(Human seller, Human buyer, Double price);
}