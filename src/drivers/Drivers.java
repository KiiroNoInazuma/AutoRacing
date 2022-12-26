package drivers;

import transport.Transport;

import java.time.LocalDate;

abstract class Drivers implements Competing {

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

    String getFio() {
        return fio;
    }

    private boolean isDriverCard() {
        return driverCard;
    }

    String getInfoDriverCard() {
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
        if (getYearDriverLicense() < 16) {
            yearDriverLicense = 16;
            System.out.println("Водитель должен быть старше 16 лет");
        }
        this.yearDriverLicense = yearDriverLicense;
    }

    @Override
    public void pitStop() {
        System.out.println(fio + " заехал на техобслуживание (заправку).");
    }

    public String startDriving(Transport transport) {
        return fio + " - водитель " + transport.startDriving();
    }

    public String stopDriving(Transport transport) {
        return fio + " - водитель " + transport.startDriving();
    }

}


