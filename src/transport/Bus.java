package transport;

public class Bus extends Transport {
    public Bus(String model, String brand, double engineCapacity) {
        super(model, brand, engineCapacity);
    }

    @Override
    public String startDriving() {
        return getModel() + " " + getBrand() + " начал движение";
    }

    @Override
    public String stopDriving() {
        lapTime(0);
        return getModel() + " " + getBrand() + " стоит на месте";
    }
}