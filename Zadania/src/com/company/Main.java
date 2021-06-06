package com.company;
import com.company.creatures.Pet;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) {



        Phone OnePlus = new Phone("OnePlus", "6", 2017, 6.0, "iOS");
        OnePlus.turnOn();
        System.out.println(OnePlus.model);


        Human Pawel = new Human("PAwel","Pietrolaj","OnePlus");
        Pawel.pet = new Pet("cat");
        Pawel.cash = 5000.00;
        Human Friend = new Human("Jaś","Kowalksi","Iphone");
        Friend.cash = 300.00;
        Friend.pet = new Pet("dog");

        Friend.pet.sell(Friend,Pawel,50.00);
        Pet Garfield = new Pet("Cat");
        Garfield.feed();
    }

}