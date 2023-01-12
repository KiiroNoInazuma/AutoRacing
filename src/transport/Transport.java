package transport;

import drivers.Competing;
import drivers.Drivers;

import java.util.List;


public abstract class Transport implements Competing {
    private final String model;
    private final String brand;
    private double engineCapacity;
    protected boolean diagnostics;
    private List<?> mechanics;
    private Drivers<?> driver;
    protected boolean check;

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

    public double getEngineCapacity() {
        return engineCapacity;
    }

    void setEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0.5) {
            System.out.println("Внимание! Малый литраж автомобиля!");
            engineCapacity = 0.0;

        }
        this.engineCapacity = engineCapacity;
    }

    public abstract String startDriving();

    public abstract String stopDriving();

    @Override
    public String pitStop() {
        return model + " " + brand + " заезжает на техобслуживание";
    }

    @Override
    public void lapTime(double maxSpeed) {
        double sp = maxSpeed(maxSpeed);
        if (maxSpeed == 0) {
            System.out.println("Лучшее время " + model + " " + brand + ": " + maxSpeed + "c.");
        } else {
            System.out.println("Лучшее время " + model + " " + brand + ": " + String.format("%.2f", 10 / sp * 3600) + " c.");
        }
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

    abstract void printType();

    abstract void getDiagnostics() throws Exception;

    public void checkDiagnostics() {
        if (diagnostics) {
            System.out.println("Автомобиль прошел диагностику");
        } else {
            System.out.println("Нужна диагностика автомобиля");
        }
    }

    protected void addMechanics(List<?> mechanics) {
        this.mechanics = mechanics;
    }

    public void allMechanics() {
        try {
            for (int i = 0; i < mechanics.size(); i++) {
                System.out.println("Автомобиль: " + model + " " + brand);
                System.out.println(mechanics.get(i));
                System.out.println("----------------------------------");
                check = true;
            }
        } catch (NullPointerException e) {
            System.out.println("Не добавлены механики!");
        }
    }


    protected void setDrivers(Drivers<?> driver) {
        this.driver = driver;
    }

    public void showDriver() {
        System.out.println("Водитель " + model + " " + brand + ": " + driver.getFio());
    }

}



