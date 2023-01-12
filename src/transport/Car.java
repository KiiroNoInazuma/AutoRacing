package transport;

import drivers.Drivers;

import java.util.List;

public class Car extends Transport {
    public static final char DRIVER_CARD = 'B';
    private BodyTypeCar type;

    public enum BodyTypeCar {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String typeCar;

        BodyTypeCar(String typeCar) {
            this.typeCar = typeCar;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + typeCar;
        }
    }

    public Car(String model, String brand, double engineCapacity, BodyTypeCar type) {
        super(model, brand, engineCapacity);
        this.type = type;
    }


    private BodyTypeCar getTypeCar() {
        return type;
    }

    public void setTypeCar(String type) {
        this.type = BodyTypeCar.valueOf(type);
    }

    @Override
    public String startDriving() {
        return getModel() + " " + getBrand() + " начал движение.";
    }

    @Override
    public String stopDriving() {
        lapTime(0);
        return getModel() + " " + getBrand() + " стоит на месте.";
    }

    @Override
    public void printType() {
        System.out.println(getTypeCar());
    }

    @Override
    public void getDiagnostics() {
        diagnostics = true;
    }


    public void addMechanicCar(List<Mechanics<Car>> mechanics) {
        super.addMechanics(mechanics);
    }

    public void setDriver(Drivers<Car> driver) {
        super.setDrivers(driver);
    }

}
