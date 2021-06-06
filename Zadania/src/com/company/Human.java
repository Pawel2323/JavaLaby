package com.company;
import com.company.creatures.Pet;
import com.company.devices.Car;

import java.util.Arrays;

public class Human {
    public String fName;
    public String lName;
    public String phone;
    private static final int DEFAULT_GARAGE = 3;
    public Pet pet;
    public Car[] garage;

    private Double salary;
    public Double cash;

    public Human(String fName, String lName, String phone) {

        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.salary = 23892183.00;
    }

    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        System.out.println(this.salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            System.out.println("Dane zostały wysłane do systemu księgowego");
            System.out.println("Nalezy koniecznie odebrać aneks do umowy od Pani Hani z kadr");
            System.out.println("ZUS i US już po Ciebie idą");
            this.salary = salary;
        } else {
            System.out.println("Nie mozna wpisać ujemnej wartosci wynagrodzenia");
        }
    }


    public String toString() {
        return "Human:" +
                "\n\tsalary=" + salary +
                "\n\tfirstName=" + fName +
                "\n\tlastName=" + lName +
                "\n\tpet=" + pet +
                "\n\tcar=" + Arrays.toString(garage);
    }

    public Car getGarage(int parkingPlaceNumber) {
        return this.garage[parkingPlaceNumber];
    }

    //*************************************************************
    // SPRZEDAŻ POJAZDU
    public void setGarage(Car car) {
        if (salary > car.value) {
            for (int i = 0; i < garage.length; i++) {
                if (garage[i] == null) {
                    garage[i] = car;
                } else {
                    System.out.println("Szukanie miejsca w garażu");
                }
            }
        } else if (salary > (car.value) / 12) {
            System.out.println("Możesz wziąć samochód w raty");
            for (int i = 0; i < garage.length; i++) {
                if (garage[i] == null) {
                    garage[i] = car;
                } else {
                    System.out.println("Szukanie miejsca w garażu");
                }
            }
        } else {
            System.out.println("Brak pieniędzy na samochód");
        }
    }

    //*************************************************************
    public double getGarageValue() {
        double value = 0.0;
        for (int i = 0; i < garage.length; i++) {
            for (Car car : garage) {
                value += car.value;
            }
        }
        return value;
    }
    public void sell(Human me, Human brother, Double price) {
    }



    public boolean hasCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (car == garage[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == carToRemove) {
                garage[i] = null;
            }
        }
    }

    public void addCar(Car carToAdd) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = carToAdd;
                return;
            }


            }

        }
}
