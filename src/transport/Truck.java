package transport;

public class Truck extends Transport {

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
}
