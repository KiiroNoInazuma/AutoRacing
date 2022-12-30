package drivers;

import MyExceptions.TypeOfDriverLicenseException;
import transport.Bus;

public class DriverD extends Drivers<Bus> {
    public DriverD(String fio, String driverCard, int yearDriverLicense) {
        super(fio, driverCard, yearDriverLicense);
    }

    @Override
    public void setDriverCard(char chr) {
        try {
            if (chr == Bus.DRIVER_CARD) {
                System.out.println("Проверка категории прав пройдена.");
            } else {
                throw new TypeOfDriverLicenseException("Ошибка!");
            }
        } catch (TypeOfDriverLicenseException e) {
            System.out.println("Ошибка! Введите верную категорию прав!");
        }

    }
}
