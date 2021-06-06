package com.company;
import com.company.devices.Devices;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) {
        Phone OnePlus = new Phone("OnePlus", "6", 2017, 6.0, "iOS");
        OnePlus.turnOn();
        System.out.println(OnePlus.model);

    }

}







