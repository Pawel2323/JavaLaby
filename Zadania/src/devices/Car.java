package devices;

public class Car {
    final private String producer;
    final private String model;
    final private String color;
    public Double value;


    public Car(String color, String model, String producer, Double value) {
        this.color = color;
        this.model = model;
        this.producer = producer;
        this.value = value;

    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }
}
