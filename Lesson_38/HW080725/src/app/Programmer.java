package app;

public class Programmer implements Employee {
    private String name;


    public Programmer(String name) {
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public String getRole() {
        return "Programmer";
    }



}
