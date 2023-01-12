package transport;


public class Mechanics<T extends Transport> {

    public enum Service {
        SERVICE("Сервис"), REPAIR("Ремонт");
        private final String nm;

        Service(String nm) {
            this.nm = nm;
        }
    }

    private final String name;
    private final String company;
    private String typeAuto;

    public Mechanics(String name, String company, String workAuto) {
        this.name = name;
        this.company = company;
        setTypeAuto(workAuto);
    }


    public void fixCar(T transport, Service service) {
        if (transport.check) {
            System.out.println(name + " проводит " + service.nm + " " + transport.getModel() + " " + transport.getBrand() + ".");
        } else {
            throw new RuntimeException("Вы не добавили механиков! Обслуживание невозможно!");
        }
    }

    public void setTypeAuto(String typeAuto) {
        if(typeAuto.equals("Легковые")||typeAuto.equals("Грузовые")||typeAuto.equals("Автобусы")) {
            this.typeAuto = typeAuto;
        }else {
            throw new RuntimeException("Введите правильный тип транспорта!");
        }
    }

    @Override
    public String toString() {
        return "Механик " + name + "\nКомпания: " + company + "\nТип обслуживаемого авто: " + typeAuto;
    }
}
