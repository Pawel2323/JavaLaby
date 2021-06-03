package devices;

public class Phone {
    String producer;
    String model;
    String screenSize;
    String System;

    public Phone(String producer, String model, String screenSize, String System) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.System = System;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", operationSystem='" + System + '\'' + '}';


    }
}