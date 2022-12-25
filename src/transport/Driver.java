package transport;

public class Driver<T extends Transport & Competing> {

    private String fio;
    private char driverCard;
    private int exp;

    public Driver(String fio, char driverCard, int exp) {
        this.fio = fio;
        this.driverCard = driverCard;
        this.exp = exp;

    }


    public void right(Car transport) {
        if (driverCard != 'B') {
            System.out.println("нет категории \"B\", запрещено водить");
        }else {
            System.out.println("Все ок");
        }
    }

    public void right(Truck transport) {
        if (driverCard != 'C') {
            System.out.println("нет категории \"C\", запрещено водить");
        }else {
            System.out.println("Все ок");
        }
    }

    public void right(Bus transport) {
        if (driverCard != 'D') {
            System.out.println("нет категории \"D\", запрещено водить");
        }else {
            System.out.println("Все ок");
        }
    }

}
