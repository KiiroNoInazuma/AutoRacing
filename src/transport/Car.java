package transport;

public class Car extends Transport {
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


    public BodyTypeCar getTypeCar() {
        return type;
    }

    public void setTypeCar(String type) { //доделать
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
}
