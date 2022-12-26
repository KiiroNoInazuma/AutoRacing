package transport;

import drivers.Competing;

abstract class Transport implements Competing {
    private final String model;
    private final String brand;
    private double engineCapacity;

    Transport(String model, String brand, double engineCapacity) {
        String def = "default";
        if (model == null || model.isBlank()) {
            System.out.println("Введите модель автомобиля.");
            model = def;
        }
        this.model = model;
        if (brand == null || brand.isBlank()) {
            System.out.println("Введите марку автомобиля.");
            brand = def;
        }
        this.brand = brand;
        setEngineCapacity(engineCapacity);
    }

    double getEngineCapacity() {
        return engineCapacity;
    }

    void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            engineCapacity = 1.0;
            System.out.println("Внимание! Малый литраж автомобиля!");
        }
        this.engineCapacity = engineCapacity;
    }

    abstract String startDriving();

    abstract String stopDriving();

    @Override
    public void pitStop() {
        System.out.println(model + brand + " заезжает на техобслуживание");
    }

    @Override
    public void lapTime(double maxSpeed) {
        System.out.println("Лучшее время " + model + " " + brand + ": " + String.format("%.2f", 10 / maxSpeed * 3600) + "c.");
        System.out.println("Максимальная скорость " + model + " " + brand + ": " + maxSpeed + " km/h");
    }

    @Override
    public double maxSpeed(double maxSpeed) {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}



