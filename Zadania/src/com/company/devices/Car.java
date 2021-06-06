package com.company.devices;



    public class Car extends Devices {
        public String color;
        public Double value;

        public Car(String producer, String model, String color, Double value, Integer yearOfProduction) {
            super(producer, model, yearOfProduction);
            this.color = color;
            this.value = value;


        }

        public void turnOn() {
            System.out.println("wlacz/wyłącz silnik");
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

