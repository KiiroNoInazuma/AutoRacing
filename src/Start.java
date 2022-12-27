import drivers.*;
import transport.*;

public class Start {

    public static void main(String[] args) {
        Car jaguar = new Car("Jaguar", "F-Type", 5.0);
        Car corvette = new Car("Chevrolet Corvette", "Stingray", 6.2);
        Car oka = new Car("Лада", "Ока", 0.6);
        DriverB driveFirst = new DriverB("Евгений Романов", "активация", 2013);
        DriverB driveSecond = new DriverB("Роман Насибуллин", "активация", 2009);
        DriverB driveThird = new DriverB("Дмитрий Тимошенко", "активация", 2009);

/*
        Truck volvo = new Truck("Volvo", "D16", 16.1);
        Truck scania = new Truck("Scania", "R730", 16.4);
        DriverC driveFourth = new DriverC("Роман Насибуллин", "активация", 2009);
        DriverC driveFifth = new DriverC("Евгений Романов", "активация", 2013);


        Bus mercedes = new Bus("Mercedes", "Travego", 11.9);
        Bus yutong = new Bus("Yutong", "U12", 14.5);
        DriverD driverSixth = new DriverD("Женя Романов", "активация", 2013);
        DriverD driveSeventh = new DriverD("Дмитрий Тимошенко", "активация", 0);*/


        driveFirst.messageInfoCheck(jaguar);
        driveSecond.messageInfoCheck(corvette);
        driveThird.messageInfoCheck(oka);

        driveFirst.setDriverCard("аннулировать");
    }
}
