package drivers;

import transport.Car;

public class DriverB extends Drivers<Car> {
    public DriverB(String fio, String driverCard, int yearDriverLicense) {
        super(fio, driverCard, yearDriverLicense);
    }

    @Override
    public void setDriverCard(char chr) {
        if(chr==Car.DRIVER_CARD){
            System.out.println("Проверка категории прав пройдена.");
        }else {
            System.out.println("Данная категория не подходит для управления ТС!");
        }
    }
}

