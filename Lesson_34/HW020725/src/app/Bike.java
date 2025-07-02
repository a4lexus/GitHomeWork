package app;

public class Bike implements Vehicle{
    private String name;
    private String color;
    private int capacity;

    public Bike(String name, String color, int capacity) {
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
        return "Bike{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public void drive() {
        System.out.println(name + ": сейчас прокатимся с ветерком!!! ");
        System.out.println(name + ": " + color + " цвет.");
        System.out.println(name + ": вмещает " + capacity + " человекa.");
    }

    @Override
    public void stop() {
        System.out.println(name + ": не гальмуй, 😲 тормози!!!");

    }
}
