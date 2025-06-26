package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Truck("545 ", "Mann ", 2015, 40));
        vehicles.add(new Car("656 ", "BMW ", 2009));
        vehicles.add(new Bus("777 ", "Iкarus-'256' ", 1977, 47)); // данные с интернета 😁
        vehicles.add(new Car("555 ", "Toyota ", 2025));
        vehicles.add(new Truck("999 ", "Volvo ", 2005, 18));

        for (Vehicle vehicle: vehicles){

            vehicle.setLoadCapacity();
            vehicle.drive();

        }
    }
}
