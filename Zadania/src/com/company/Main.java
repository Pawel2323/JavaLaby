package com.company;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) {
        Diesel Audi = new Diesel("BMW", "Seria 1", "Black", 10500.0, 2005) {

            public void refuel() {

            }
        };
        LPG Golf = new LPG("BMW", "Seria 1", "Red", 11500, 2000) {

            public void refuel() {

            }
        };
        Electric Tesla = new Electric("Tesla", "CyberTruck", "Red", 1000000.0, 2022) {

            public void refuel() {
            }
        };


                Phone OnePlus = new Phone("OnePlus", "6", 2017, 6.0, "iOS");
                OnePlus.turnOn();
                System.out.println(OnePlus.model);


                Human Pawel = new Human("PAwel", "Pietrolaj", "OnePlus");
                Pawel.pet = new Pet("cat");
                Pawel.cash = 5000.00;
                Human Friend = new Human("Jaś", "Kowalksi", "Iphone");
                Friend.cash = 300.00;
                Friend.pet = new Pet("dog");

                Friend.pet.sell(Friend, Pawel, 50.00);
                Pet Garfield = new Pet("Cat");
                Garfield.feed();

            }
        }



