package app;

public class QAEngineer implements Employee {

    private String name;

    public QAEngineer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return "QA Engineer";
    }

}
