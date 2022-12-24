package transport;

public class Truck extends Transport implements Competing {

    public Truck(String model, String brand, double engVolume) {
        super(model, brand, engVolume);
    }

    @Override
    public void startMoving() {
        System.out.println(getModel() + " " + getBrand() + " " + getEngVolume() + " - START");
    }

    @Override
    public void finishMoving() {
        System.out.println(getModel() + " " + getBrand() + " " + getEngVolume() + " - FINISH");
    }

    @Override
    public void pitStop() {
        System.out.println(getModel() + " " + getBrand() + " " + getEngVolume() + " - Питстоп");
    }

    @Override
    public double bestLapTime() {
        return 185;
    }

    @Override
    public double maxSpeed() {
        return 220;
    }
}
