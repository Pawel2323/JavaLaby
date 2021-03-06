package com.company.devices;
import com.company.Human;

import java.util.ArrayList;


public abstract class Car extends Devices {
    private final String color;
    public Double value;
    public ArrayList<Human> Owners = new ArrayList<>();
    public Car(String producer, String model, String color, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;
    }
    public void turnOn() {
        System.out.println("wlacz/wyłącz silnik");
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Sprzedawca nie ma auta");
        }
        if (!buyer.hasFreeParkingLot()) {
            throw new Exception("Kupujący nie ma miejsca");
        }
        if (buyer.cash < price) {
            throw new Exception("Kupujący nie ma kasy");
        }

        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("Sprzedano auto");
    }


    public Human getCurrentOwner() {
        if (Owners.isEmpty())
            return null;
        else
            return Owners.get(Owners.size() - 1);
    }

    public void addOwner(Human Friend) {
        Owners.add(Friend);
    }

    public boolean wasOwner(Human Friend) {
        return Owners.contains(Friend);
    }

    public int transaction() {
        return Owners.size();
    }



}








//  @Override
//  public String toString() {
//  return "Car{" +
//    "producer='" + producer + '\'' +
//  /  ", model='" + model + '\'' +
// ", color='" + color + '\'' +
//  ", value=" + value +
//    '}';
//}