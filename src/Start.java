import drivers.*;
import transport.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Start {


    public static void main(String[] args) {
        Mechanics<Car> mechanicsJaguar = new Mechanics<>("Ардаков Игорь Герасимович", "CarSport", "Легковые");
        Car jaguar = new Car("Jaguar", "F-Type", 5.0, Car.BodyTypeCar.COUPE);
        Mechanics<Car> mechanicsCorvette = new Mechanics<>("Донченко Иван Андреевич", "CarSport", "Легковые");
        Car corvette = new Car("Chevrolet Corvette", "Stingray", 6.2, Car.BodyTypeCar.SEDAN);
        Mechanics<Car> mechanicsOka = new Mechanics<>("Кулагина Юлия Анатольевна", "CarSport", "Легковые");
        Car oka = new Car("Лада", "Ока", 0.6, Car.BodyTypeCar.HATCHBACK);
        DriverB driveFirst = new DriverB("Евгений Романов", "активация", 2013);
        DriverB driveSecond = new DriverB("Роман Насибуллин", "активация", 2009);
        DriverB driveThird = new DriverB("Дмитрий Тимошенко", "активация", 2009);

        Mechanics<Truck> mechanicsVolvo = new Mechanics<>("Бирюков Евгений Евгеньевич", "TruckSport", "Грузовые");
        Truck volvo = new Truck("Volvo", "D16", 16.1, Truck.BodyTypeTruck.N2);
        Mechanics<Truck> mechanicsScania = new Mechanics<>("Васильев Валерий Валентинович", "TruckSport", "Грузовые");
        Truck scania = new Truck("Scania", "R730", 16.4, Truck.BodyTypeTruck.N3);
        DriverC driveFourth = new DriverC("Роман Насибуллин", "активация", 2009);
        DriverC driveFifth = new DriverC("Евгений Романов", "активация", 2013);

        Mechanics<Bus> mechanicsMercedes = new Mechanics<>("Угаров Виктор Михайлович", "BusSport", "Автобусы");
        Bus mercedes = new Bus("Mercedes", "Travego", 11.9, Bus.BodyTypeBus.LARGE);
        Mechanics<Bus> mechanicsYutong = new Mechanics<>("Дылдин Алексей Валерьевич ", "BusSport", "Автобусы");
        Bus yutong = new Bus("Yutong", "U12", 14.5, Bus.BodyTypeBus.ESPECIALLY_LARGE);
        DriverD driverSixth = new DriverD("Женя Романов", "активация", 2013);
        DriverD driveSeventh = new DriverD("Дмитрий Тимошенко", "активация", 0);


        List<Drivers<?>> listDrivers = Arrays.asList(driveFirst, driveSecond, driveThird, driveFourth, driveFifth, driverSixth, driveSeventh);
        List<Mechanics<?>> listMechanics = Arrays.asList(mechanicsJaguar, mechanicsCorvette, mechanicsOka, mechanicsVolvo, mechanicsScania, mechanicsMercedes, mechanicsYutong);
        List<Transport> listAuto = Arrays.asList(jaguar, corvette, oka, volvo, scania, mercedes, yutong);
        jaguar.addMechanic(mechanicsCorvette,mechanicsOka);
        listAuto.get(0).allMechanics();
    }


}

