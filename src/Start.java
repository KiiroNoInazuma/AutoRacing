import drivers.Drivers;
import transport.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Start extends Add {
    public static void main(String[] args) {


        List<Drivers<Car>> carDrivers = Arrays.asList(driveFirst, driveSecond, driveThird);
        List<Drivers<Truck>> truckDrivers = Arrays.asList(driveFourth, driveFifth);
        List<Drivers<Bus>> busDrivers = Arrays.asList(driverSixth, driveSeventh);
        LinkedList<Drivers<?>> allDrivers = new LinkedList<>();
        allDrivers.addAll(carDrivers);
        allDrivers.addAll(truckDrivers);
        allDrivers.addAll(busDrivers);


        List<Mechanics<Car>> carMechanics = Arrays.asList(mechanicsJaguar, mechanicsCorvette, mechanicsOka);
        List<Mechanics<Truck>> truckMechanics = Arrays.asList(mechanicsVolvo, mechanicsScania);
        List<Mechanics<Bus>> busMechanics = Arrays.asList(mechanicsMercedes, mechanicsYutong);
        LinkedList<Mechanics<?>> allMechanics = new LinkedList<>();
        allMechanics.addAll(carMechanics);
        allMechanics.addAll(truckMechanics);
        allMechanics.addAll(busMechanics);


        List<Car> carAuto = Arrays.asList(jaguar, corvette, oka);
        List<Truck> truckAuto = Arrays.asList(volvo, scania);
        List<Bus> busAuto = Arrays.asList(mercedes, yutong);
        LinkedList<Transport> allAuto = new LinkedList<>();
        allAuto.addAll(carAuto);
        allAuto.addAll(truckAuto);
        allAuto.addAll(busAuto);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        carAuto.get(0).addMechanicCar(carMechanics);
        carAuto.get(1).setDriver(carDrivers.get(0));
        allAuto.get(0).allMechanics();
        carMechanics.get(0).fixCar(carAuto.get(0), "техобслуживание");


    }

}

