package com.company;

public class Main {

    public static void main(String[] args) {


        Human my = new Human();
        my.fName = "Pawel";
        my.lName = "Pietrolaj";
        my.pet = cat;


        Phone OnePlus = new Phone();
        OnePlus.screenSize = 6.3;
        OnePlus.producer = "OnePlus";
        OnePlus.model = "6";
        OnePlus.System = "Android11";

        Animal cat = new Animal("cat");

        cat.feed();
        cat.feed();
        cat.feed();
        cat.feed();
        cat.walk();
        cat.walk();
        cat.walk();
        cat.walk();
        cat.walk();


    }
}
