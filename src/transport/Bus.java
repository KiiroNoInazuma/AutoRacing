package transport;

public class Bus extends Transport {
    public Bus(String model, String brand, double engineCapacity) {
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
