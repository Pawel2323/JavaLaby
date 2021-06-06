package com.company;

public class Animal implements Selleable {
    final private String species;
    public Double weight;
    public String name;


    static final public double DEFAULT_ANIMAL_WEIGHT = 1.0;
    static final public double DEFAULT_DOG_WEIGHT = 3.0;
    static final public double DEFAULT_CAT_WEIGHT = 2.0;
    static final public double DEFAULT_COW_WEIGHT = 300.0;

    public Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "cat":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "cow":
                this.weight = DEFAULT_COW_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
                break;
        }
    }

    void feed() {
        if (weight > 0) {
            weight += 1;
            System.out.println("Mmm..Yummi");
        }
    }

    void walk() {
        if (this.weight <= 0) {
            System.out.println("Dude I'm dead right now. Leave me!.");
        } else {
            weight -= 1;
            System.out.println(species + "Give me foodie :(");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +

                '}';
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this) {
            System.out.println("Nie możesz tego sprzedać, bo tego nie masz");
        } else if (buyer.cash < price) {
            System.out.println("Nie masz środków");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transakcja udana sprzedano" + this + "za" + price);
        }
    }
}