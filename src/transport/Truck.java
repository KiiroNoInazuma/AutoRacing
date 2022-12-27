package transport;

public class Truck extends Transport {
    private BodyTypeTruck type;

    public enum BodyTypeTruck {
        N1(0.0, 3.5),
        N2(3.5, 12.0),
        N3(12.0, null);
        private final Double lowerLimit;
        private final Double upperLimit;

        BodyTypeTruck(Double lowerLimit, Double upperLimit) {
            this.lowerLimit = lowerLimit;
            this.upperLimit = upperLimit;
        }

        @Override
        public String toString() {
            if (lowerLimit == null) {
                return "Грузоподъёмность:  до " + upperLimit + "т.";
            } else if (upperLimit == null) {
                return "Грузоподъёмность: от " + lowerLimit + "т.";
            } else {
                return "Грузоподъёмность: от " + lowerLimit + "т." + " до " + upperLimit + "т.";
            }

        }
    }

    public Truck(String model, String brand, double engineCapacity, BodyTypeTruck type) {
        super(model, brand, engineCapacity);
        this.type = type;
    }

    public BodyTypeTruck getTypeTruck() {
        return type;
    }

    public void setTypeTruck(String type) {
        this.type = BodyTypeTruck.valueOf(type);
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
        System.out.println(getTypeTruck());
    }
}
