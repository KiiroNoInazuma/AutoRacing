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
        /*Инструкция*/
        //Добавление различных типов механиков и водителей осуществляется строго по типу автомобилей.
        //Выше добавлены соответствующие типы авто и механиков с водителями, а также общие списки тех или иных объектов.
        //Согласно заданию сделал вариант, где физически нельзя добавлять неподходящих субъектов к авто.

        /*Добавление механиков*/
        carAuto.get(0).addMechanicCar(carMechanics);//если попытаться поставить другой тип механиков, подчеркнет красным

        /*Добавление водителей*/
        carAuto.get(0).setDriver(carDrivers.get(0));// ситуация такая же, невозможно добавить водителей не своей категории
        carAuto.get(0).setDriver(driveFirst); //реализовано добавление напрямую не используя список
        /*Просмотр назначенного водителя и механиков*/

        allAuto.get(0).allMechanics();       //просмотр всех добавленных механиков у выбранного авто (если не добавлено, выведет ошибку)
        allAuto.get(0).showDriver();     //просмотр всех добавленных водителей у выбранного авто (если не добавлено, выведет ошибку)

        /*Методы техосмотра и обслуживания*/
        mechanicsCorvette.fixCar(jaguar, Mechanics.Service.REPAIR);//также невозможно добавить авто механика, который отвечает за другой тип авто.
        //здесь серви реализовал за счет enum
    }

}

