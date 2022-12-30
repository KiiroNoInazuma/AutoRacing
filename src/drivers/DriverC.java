package drivers;

import transport.Car;
import transport.Truck;

public class DriverC extends Drivers<Truck> {
    public DriverC(String fio, String driverCard, int yearDriverLicense) {
        super(fio, driverCard, yearDriverLicense);
    }

    @Override
    public void setDriverCard(char chr) {
        if(chr== Truck.DRIVER_CARD){
            System.out.println("Проверка категории прав пройдена.");
        }else {
            System.out.println("Данная категория не подходит для управления ТС!");
        }
    }


}
