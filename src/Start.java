import transport.*;

public class Start {
    public static void main(String[] args) {
        Car jaguar = new Car("Jaguar", "F-Type", 5.0);
        Car corvette = new Car("Chevrolet Corvette", "Stingray", 6.2);

        Truck volvo = new Truck("Volvo", "D16", 16.1);
        Truck scania = new Truck("Scania", "R730", 16.4);

        Bus mercedes = new Bus("Mercedes", "Travego", 11.9);
        Bus yutong = new Bus("Yutong", "U12", 14.5);

        corvette.lapTime(jaguar.maxSpeed(221));

    }
}

