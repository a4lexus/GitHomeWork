package app;

public class Bus extends Vehicle {
    private int numberOfPassenger;

    public Bus(String number, String brand, int year, int numberOfPassenger) {
        super(number, brand, year);
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public String toString() {
        return getNumber() + getBrand() + getYear() + numberOfPassenger;
    }

    public void setLoadCapacity() {
        System.out.println("Номер: " + getNumber() +  getBrand() + getYear() + " г.выпуска перевозит максимально: " + getNumberOfPassenger() + " пассажиров.");

}


    public void drive() {
        System.out.println(getNumber() + " поехали!");
    }
}
