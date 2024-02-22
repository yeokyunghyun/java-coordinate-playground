package _03_inject_fuel;

public class Car {

    private final String type;
    private final int fuelEfficiency;

    public Car(String type, int fuelEfficiency) {
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
    }
}
