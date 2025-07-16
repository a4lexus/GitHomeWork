package app;

import java.util.Objects;

public class Auto {
    private int id;
    private String brand;
    private int year;
    private int price;

    public Auto(int id, String brand, int year, int price) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto [" + "id:" + id + ", марка: " + brand + ", год:" + year + ", цена: " + price + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return id == auto.id && year == auto.year && price == auto.price && Objects.equals(brand, auto.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, year, price);
    }
}
