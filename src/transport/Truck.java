package transport;

public class Truck extends Transport {
    public Truck(String model, String brand, double engineCapacity) {
        super(model, brand, engineCapacity);
    }

    @Override
    public String startDriving() {
        return getModel() + " " + getBrand() + " начал движение";
    }

    @Override
    public String stopDriving() {
        return getModel() + " " + getBrand() + " стоит на месте";
    }
}
