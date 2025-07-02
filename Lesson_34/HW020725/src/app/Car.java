package app;

import java.util.List;

public class Car implements Vehicle{
    private String name;
    private String color;
    private int capacity;

    public Car(String name, String color, int capacity) {
        this.name = name;
        this.color = color;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public void drive() {
        System.out.println(name + ": шофёр жми на газ!!! ");
        System.out.println(name + ": " + color + " цвет. ");
        System.out.println(name + ": вмещает " + capacity + " человек.");

    }

    @Override
    public void stop() {
        System.out.println(name + ": Скорей тормози!!!");

    }
}
