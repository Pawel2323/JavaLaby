package com.company.devices;



public class Electric extends Car {
    public Electric(String color, String model, String producer, double value, Integer yearOfProduction) {
        super(color, model, producer, value, yearOfProduction);
    }


    public void fuel() {
        System.out.println("Naładowano akumulatory - 100%");

    }
}
