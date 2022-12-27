package drivers;

import transport.Truck;

public class DriverC extends Drivers<Truck> {
    public DriverC(String fio, String driverCard, int yearDriverLicense) {
        super(fio, driverCard, yearDriverLicense);
    }
}