package app;

import java.util.ArrayList;
import java.util.List;

/*
Задача 1.
Создайте интерфейс Vehicle с методами drive(), stop().
Реализуйте этот интерфейс в классах Car, Boat, Bike.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-----Все готовы ?!?!-------");
        Car car = new Car("Ауди Q7", "чёрный", 7);
        Boat boat = new Boat("Ракета-340", "белый", 65);
        Bike bike = new Bike("Хонда-1100RR","красный", 2);
        temp(car);
        System.out.println("===========================");
        temp(boat);
        System.out.println("===========================");
        temp(bike);
        System.out.println("===========================");


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(boat);
        vehicles.add(bike);
        driveAll(vehicles);

    }
    public static void temp (Vehicle vehicle){
        vehicle.drive();
        vehicle.stop();
    }
    public static void driveAll(List<Vehicle> list){
        System.out.println("---------Стартуем!---------");
        for (Vehicle vehicle: list){
            System.out.println("---" + vehicle.getType() + "---");
            vehicle.drive();
            vehicle.stop();

        }
    }

}
