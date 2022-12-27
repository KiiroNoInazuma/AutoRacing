package drivers;

import transport.Transport;

import java.time.LocalDate;

abstract class Drivers<T extends Transport & Competing> {

    private final String fio;
    private boolean driverCard;
    private int yearDriverLicense;

    Drivers(String fio, String driverCard, int yearDriverLicense) {
        if (fio == null || fio.isBlank()) {
            fio = "Неизвестный водитель";
        }
        this.fio = fio;
        setDriverCard(driverCard);
        setYearDriverLicense(yearDriverLicense);
    }

    public String getFio() {
        return fio;
    }

    private boolean isDriverCard() {
        return driverCard;
    }

    public String getInfoDriverCard() {
        if (isDriverCard()) return "Лицензия ативна.";
        return "Лицензия аннулирована.";
    }

    public void setDriverCard(String driverCard) {
        driverCard = driverCard.toLowerCase();
        if (driverCard.equals("активация")) {
            this.driverCard = true;
        } else {
            this.driverCard = false;
        }
    }

    public int getYearDriverLicense() {
        int year = LocalDate.now().getYear() - yearDriverLicense;
        return year;
    }

    public void setYearDriverLicense(int yearDriverLicense) {
        if (getYearDriverLicense() < 5) {
            yearDriverLicense = 0;
            System.out.println("Водитель должен быть старше 16 лет");
        }
        this.yearDriverLicense = yearDriverLicense;
    }


    public void pitStop(T transport) {
        System.out.println(getFio() + " управляя " + transport.pitStop());
    }

    public String startDriving(T transport) {
        return getFio() + " - водитель " + transport.startDriving();
    }

    public String stopDriving(T transport) {
        return getFio() + " - водитель " + transport.startDriving();
    }

    public void messageInfoCheck(T transport) {
        if (getYearDriverLicense() >= 5 && driverCard) {
            System.out.println("Водитель " + fio + " управляет автомобилем "
                    + transport.getModel() + " " + transport.getBrand() + " и будет участвовать в заезде!");
        } else {
            System.out.println("Водитель " + fio + " не может управлять автомобилем "
                    + transport.getModel() + " " + transport.getBrand());
        }
    }
}


