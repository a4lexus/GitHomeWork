package app;

public interface Vehicle {
    void drive();
    default String getType(){
        return "Транспортное средство";

    }
    void stop();
}
