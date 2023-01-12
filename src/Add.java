import drivers.*;
import transport.*;


public class Add {

    static Mechanics<Car> mechanicsJaguar = new Mechanics<>("Ардаков Игорь Герасимович", "CarSport", "Легковые");
    static Car jaguar = new Car("Jaguar", "F-Type", 5.0, Car.BodyTypeCar.COUPE);
    static Mechanics<Car> mechanicsCorvette = new Mechanics<>("Донченко Иван Андреевич", "CarSport", "Легковые");
    static Car corvette = new Car("Chevrolet Corvette", "Stingray", 6.2, Car.BodyTypeCar.SEDAN);
    static Mechanics<Car> mechanicsOka = new Mechanics<>("Кулагина Юлия Анатольевна", "CarSport", "Легковые");
    static Car oka = new Car("Лада", "Ока", 0.6, Car.BodyTypeCar.HATCHBACK);
    static DriverB driveFirst = new DriverB("Евгений Романов", "активация", 2013);
    static DriverB driveSecond = new DriverB("Роман Насибуллин", "активация", 2009);
    static DriverB driveThird = new DriverB("Дмитрий Тимошенко", "активация", 2009);

    static Mechanics<Truck> mechanicsVolvo = new Mechanics<>("Бирюков Евгений Евгеньевич", "TruckSport", "Грузовые");
    static Truck volvo = new Truck("Volvo", "D16", 16.1, Truck.BodyTypeTruck.N2);
    static Mechanics<Truck> mechanicsScania = new Mechanics<>("Васильев Валерий Валентинович", "TruckSport", "Грузовые");
    static Truck scania = new Truck("Scania", "R730", 16.4, Truck.BodyTypeTruck.N3);
    static DriverC driveFourth = new DriverC("Роман Насибуллин", "активация", 2009);
    static DriverC driveFifth = new DriverC("Евгений Романов", "активация", 2013);

    static Mechanics<Bus> mechanicsMercedes = new Mechanics<>("Угаров Виктор Михайлович", "BusSport", "Автобусы");
    static Bus mercedes = new Bus("Mercedes", "Travego", 11.9, Bus.BodyTypeBus.LARGE);
    static Mechanics<Bus> mechanicsYutong = new Mechanics<>("Дылдин Алексей Валерьевич ", "BusSport", "Автобусы");
    static Bus yutong = new Bus("Yutong", "U12", 14.5, Bus.BodyTypeBus.ESPECIALLY_LARGE);
    static DriverD driverSixth = new DriverD("Женя Романов", "активация", 2013);
    static DriverD driveSeventh = new DriverD("Дмитрий Тимошенко", "активация", 0);

}
