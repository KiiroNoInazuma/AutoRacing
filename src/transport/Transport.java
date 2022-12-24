package transport;

abstract class Transport implements Competing {
    private final String model;
    private final String brand;
    private double engVolume;


    Transport(String model, String brand, double engVolume) {
        String def = "default";
        if (brand == null || brand.isBlank()) brand = def;
        this.brand = brand;
        if (model == null || model.isBlank()) model = def;
        this.model = model;
        setEngVolume(engVolume);
    }

    String getModel() {
        return model;
    }

    String getBrand() {
        return brand;
    }

    double getEngVolume() {
        return engVolume;
    }

    void setEngVolume(double engineVolume) {
        if (engineVolume <= 0) engineVolume = 1.5;
        this.engVolume = engineVolume;
    }

    void startMoving() {
        System.out.println(getModel() + " " + getBrand() + " " + getEngVolume() + " - START");
    }


    void finishMoving() {
        System.out.println(getModel() + " " + getBrand() + " " + getEngVolume() + " - FINISH");
    }

    @Override
    public void pitStop(boolean pitStop) {
        System.out.println(getModel() + " " + getBrand() + " " + getEngVolume() + " - заправка");
    }

    @Override
    public double bestLapTime(double time) {
        return time;
    }

    @Override
    public double maxSpeed(double maxS) {
        return maxS;
    }
}



