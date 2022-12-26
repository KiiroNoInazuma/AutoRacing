package transport;

import lombok.Getter;

@Getter
abstract class Transport {
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

    void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            engineCapacity = 1.0;
            System.out.println("Внимание! Малый литраж автомобиля!");
        }
        this.engineCapacity = engineCapacity;
    }

    abstract String startDriving();
    abstract String stopDriving();
}



