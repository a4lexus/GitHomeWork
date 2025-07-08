package app;

public class Main {
    public static void main(String[] args) {

        Manager<Programmer> devManager = new Manager<>("Kolya");
        devManager.addTeamMember(new BackEndProgrammer("Lena"));
        devManager.addTeamMember(new FrontEndProgrammer("Petya"));
        devManager.addTeamMember(new FrontEndProgrammer("Vasya"));
        devManager.addTeamMember(new BackEndProgrammer("Dima"));
        devManager.printTeam();
        System.out.println("=========================================");

        Manager<QAEngineer> qaManager = new Manager<>("Alex");
        qaManager.addTeamMember(new QAEngineer("Vitya"));
        qaManager.addTeamMember(new QAEngineer("Olga"));
        qaManager.printTeam();

        }
    }

