package com.company.devices;
import com.company.Human;
public class Phone extends Devices {
    public String applicationName;
    public Double applicationVersion;
    public String serverAddress;
    public String[] applicationlist;
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


    public void installAnApp(String applicationName) {
        this.applicationName = applicationName;
    }

    public void installAnApp(String applicationName, Double applicationVersion) {
        this.applicationName = applicationName;
        this.applicationVersion = applicationVersion;
    }

    public void installAnApp(String applicationName, Double applicationVersion, String serverAddress) {
        this.applicationName = applicationName;
        this.applicationVersion = applicationVersion;
        this.serverAddress = serverAddress;
    }

    public void installAnApp(String[] applist) {
        this.applicationlist = applist;
    }
}