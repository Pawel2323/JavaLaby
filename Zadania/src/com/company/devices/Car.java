package com.company.devices;
import com.company.Human;


public class Car extends Devices {
    private final String color;
    public Double value;

    public Car(String producer, String model, String color, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;
    }
    public void turnOn() {
        System.out.println("wlacz/wyłącz silnik");
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.auto != this) {
            System.out.println("Nie możesz tego sprzedac");
        } else if (buyer.cash < price) {
            System.out.println("Nie masz środkó");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.auto = seller.auto;
            seller.auto = null;
            System.out.println("Udana transakcja");
        }
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