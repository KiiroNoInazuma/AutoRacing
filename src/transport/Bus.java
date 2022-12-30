package transport;

public class Bus extends Transport {
    private Bus.BodyTypeBus type;
    public static final char DRIVER_CARD = 'D';

    public enum BodyTypeBus {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        ESPECIALLY_LARGE(100, 200);
        private final Integer lowerLimit;
        private final Integer upperLimit;

        BodyTypeBus(Integer lowerLimit, Integer upperLimit) {
            this.lowerLimit = lowerLimit;
            this.upperLimit = upperLimit;
        }

        @Override
        public String toString() {
            if (lowerLimit == null) {
                return "Вместимость: до " + upperLimit + "т.";
            } else if (upperLimit == null) {
                return "Вместимость: от " + lowerLimit + "т.";
            } else {
                return "Вместимость: от " + lowerLimit + "т." + " до " + upperLimit + "т.";
            }

        }
    }

    public Bus(String model, String brand, double engineCapacity, BodyTypeBus type) {
        super(model, brand, engineCapacity);
        this.type = type;
    }

    public BodyTypeBus getTypeBus() {
        return type;
    }

    public void setTypeTruck(String type) {//доделать
        this.type = BodyTypeBus.valueOf(type);
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

    @Override
    public void printType() {
        System.out.println(getTypeBus());
    }

    @Override
    public void getDiagnostics()  {
        throw new RuntimeException("Диагностика для данного вида транспорта недоступна.");

    }
}
