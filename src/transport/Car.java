package transport;

public class Car extends Transport {
    public Car(String model, String brand, double engineCapacity) {
        super(model, brand, engineCapacity);
    }

    @Override
    public String startDriving() {
        return getModel() + " " + getBrand() + "движется";
    }

    @Override
    public String stopDriving() {
        return getModel() + " " + getBrand() + "стоит на месте";
    }
}
