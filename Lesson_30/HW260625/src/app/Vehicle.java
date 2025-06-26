package app;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String number;
    private String brand;
    private int year;

    public Vehicle(String number, String brand, int year) {
        this.number = number;
        this.brand = brand;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "номер: " + number + "марка: " + brand + "год выпуска: " + year;
    }

    public void drive() {
        System.out.println(getNumber() + "поехали!");

    }
    public void setLoadCapacity() {
        System.out.println(getNumber() + getBrand() + getYear() + " перевозит максимально: ");

    }

}