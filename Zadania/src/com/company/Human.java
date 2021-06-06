package com.company;
import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
public class Human extends Animal{
    public String fName;
    public String lName;
    public String phone;
    public Pet pet;
    public Car auto;
    private Double salary;
    public Double cash;

    public Human(String fName, String lName, String phone) {
        super("homosapiens");
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
        }
        else {
            System.out.println("Nie mozna wpisać ujemnej wartosci wynagrodzenia");
        }
    }
    public Car getCar() {
        return auto;
    }
    public void setCar(Car auto) {
        if (salary > auto.value) {
            this.auto = auto;
            System.out.println("Kupiłeś samochód");
        }
        else if (salary > (auto.value) / 12) {
            this.auto = auto;
            System.out.println("Kupiłeś samochód na raty");
        }
        else {
            System.out.println("Do roboty!!!!");
        }
    }
    @Override
    public String toString() {
        return "Human{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                ", auto=" + auto +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void feed(Double foodWeight) {

    }
}