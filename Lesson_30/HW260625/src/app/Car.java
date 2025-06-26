package app;

public class Car extends Vehicle{

    public Car(String number, String brand, int year) {
        super(number,brand,year);

    }
    public void drive(){
        System.out.println(getNumber() + " поехали!");
    }
    public void setLoadCapacity(){
        System.out.println("Номер: " + getNumber() +  getBrand() + getYear() + " г.выпуска перевозит максимально 5 человек");
    }
}
