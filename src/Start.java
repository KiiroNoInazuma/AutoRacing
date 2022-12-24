import transport.*;


public class Start {
    public static void main(String[] args) {
        Car car = new Car("Audi", "RS6", 4.1);
        Truck truck = new Truck("kaMAZ", "43509M", 12.9);
        Bus bus = new Bus("Higher", "KLQ 6119TQ", 9);


        Driver<Car, Truck, Bus> driver = new Driver<>("Тестов Тест Тестович", 'B', 25);
        //если нужно программно ограничить, то указываем так: Driver<Car> driver = new Driver<>("Тестов Тест Тестович", 'B', 25);
        driver.right(car);



    }
}
