package app;

public class Boat implements Vehicle{
    private String name;
    private String color;
    private int capacity;

    public Boat(String name, String color, int capacity) {
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
        return "Boat{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", capacity=" + capacity + '}';
    }

    @Override
    public void drive() {
        System.out.println(name + ": выходим в море!!! ");
        System.out.println(name + ": " + color + " цвет. ");
        System.out.println(name + ": вмещает " + capacity + " человек.");
    }

    @Override
    public void stop() {
        System.out.println(name + ": аккуратней на виражах!!!");

    }
}
