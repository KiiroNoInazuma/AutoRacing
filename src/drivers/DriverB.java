package drivers;

import transport.Car;

public class DriverB extends Drivers<Car> {
    public DriverB(String fio, String driverCard, int yearDriverLicense) {
        super(fio, driverCard, yearDriverLicense);
    }
}