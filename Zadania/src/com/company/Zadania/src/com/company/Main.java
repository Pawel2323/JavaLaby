package com.company;

public class Main {

    public static void main(String[] args) {


        Animal cat = new Animal("cat");
        cat.feed();
        cat.walk();
        cat.walk();
        cat.walk();
        Human Pawel = new Human("Pawel", "Pietrolaj");
           Pawel.pet = new Animal("cat");
           Pawel.auto = new Car("Black", "Camaro", "Chevrolet",30000.00);
           Pawel.phone = new Phone(" OnePlus", " 6", "6.6", " Android");
           Pawel.setCar(Pawel.auto);
            System.out.println(Pawel.getCar());
        System.out.println(Pawel.getSalary() + "$");
//Sett 3 i 4
        Pawel.getSalary();
        Pawel.setSalary(234.02);

    }


}


