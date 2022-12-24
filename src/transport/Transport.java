package transport;

abstract class Transport {
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

    public abstract void startMoving();

    abstract void finishMoving();

}



