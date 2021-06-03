package com.company;
import devices.Car;

public class Human {
        public String fName;
        public String lName;
        protected String phone;
        protected Animal pet;
        protected Car auto;
        private Double salary = 31233.23;


        public Human(String firstName, String lastName) {
                this.fName = firstName;
                this.lName = lastName;

        }

        public double getSalary() {
                System.out.println(java.time.LocalDate.now());
                System.out.println(this.salary);

                return salary;

        }

        public void setSalary(double salary) {
                if (salary > 0) {
                        System.out.println("Dane zostały zaksięgowane");
                        System.out.println("Należy koniecznie odebrać aneks od Pani Basi z działu kadr");
                        System.out.println("ZUS i US już wiedzą....już nadchodzą");
                        this.salary = salary;

                } else {
                        System.out.println("Wynagrodzenie nie może być ujemne");
                }
        }
        public Car getCar() {
                return auto;
        }

        public void setCar(Car auto) {
                if (salary > auto.value) {
                        this.auto = auto;
                        System.out.println("Udało się zakupić samochód");
                }
                else if (salary > (auto.value) / 12) {
                        this.auto = auto;
                        System.out.println("Udało się kupić samochó na raty :)");

                }
                else {
                        System.out.println("Rusz się do pracy");
                }
        }
        @Override
        public String toString() {
                return "Human{" +
                        "firstName='" + fName + '\'' +
                        ", lastName='" + lName + '\'' +
                        ", phone='" + phone + '\'' +
                        ", pet=" + pet +
                        ", auto=" + auto +
                        ", salary=" + salary +
                        '}';
        }

}