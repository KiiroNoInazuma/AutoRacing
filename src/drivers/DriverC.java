package drivers;

import MyExceptions.TypeOfDriverLicenseException;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class DriverC extends Drivers<Truck> {
    public DriverC(String fio, String driverCard, int yearDriverLicense) {
        super(fio, driverCard, yearDriverLicense);
    }

    @Override
    public void setDriverCard(char chr) {
        try {
            if (chr == Truck.DRIVER_CARD) {
                System.out.println("Проверка категории прав пройдена.");
            } else {
                throw new TypeOfDriverLicenseException("Ошибка!");
            }
        } catch (TypeOfDriverLicenseException e) {
            System.out.println("Ошибка! Введите верную категорию прав!");
        }
    }


}
