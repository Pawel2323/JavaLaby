package com.company;
import devices.Car;

public class Main {

    public static void main(String[] args) {


        Animal cat = new Animal("cat");
        cat.feed();
        cat.walk();
        cat.walk();
        cat.walk();
        Human Pawel = new Human("Pawel", "Pietrolaj");
           Pawel.pet = new Animal("cat");
           Pawel.auto = new Car("Black", "Camaro", "Chevrolet",300000.00);

           Pawel.setCar(Pawel.auto);
            System.out.println(Pawel.getCar());
            Car auto1 = new Car("Black", "Challenger", " Dodge", 190000.00);
            Car auto2 = new Car("Black", "Mustang 5.0", " Ford", 120000.00);
        System.out.println(Pawel.getSalary() + "$");
//Sett 3 i 4
        Pawel.getSalary();
        Pawel.setSalary(234.02);

    }


}


