package transport;


public class Mechanics<T extends Transport> {


    private final String name;
    private final String company;
    private String typeAuto;

    public Mechanics(String name, String company, String workAuto) {
        this.name = name;
        this.company = company;
        this.typeAuto = workAuto;
    }


    public void fixCar(T transport, String typeTO) {
        System.out.println(name + " проводит " + typeTO + " " + transport.getModel() + " " + transport.getBrand() + ".");
    }


    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getTypeAuto() {
        return typeAuto;
    }

    @Override
    public String toString() {
        return "Механик " + name + "\nКомпания: " + company + "\nТип обслуживаемого авто: " + typeAuto;
    }
}
