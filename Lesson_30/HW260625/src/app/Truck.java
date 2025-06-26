package app;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String number, String brand, int year, int loadCapacity) {
        super(number, brand, year);
        this.loadCapacity = loadCapacity;
    }

    public long getLoadCapacity() {
        return loadCapacity;
    }

    public String toString() {
        return "Truck " + getNumber() + getBrand() + getYear() + loadCapacity ;
    }
    public void setLoadCapacity() {
        System.out.println("Номер: " + getNumber() +  getBrand() + getYear() + " г.выпуска перевозит максимально: " + loadCapacity + " тонн груза");

    }

    public void drive() {
        System.out.println(getNumber() + " поехали!");
    }
}
