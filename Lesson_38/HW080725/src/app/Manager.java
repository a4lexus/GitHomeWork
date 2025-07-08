package app;

import java.util.ArrayList;
import java.util.List;

public class Manager<T extends Employee>{
    private String name;
    private List<T> team = new ArrayList<>();

    public Manager(String name){
        this.name = name;
    }

    public void addTeamMember(T member){
        team.add(member);
        System.out.println(member.getName() + " добавлен в команду менеджера " + name);
    }
    public List<T> getTeam() {
        return team;
    }

    public void printTeam() {
        System.out.println("Команда менеджера: " + name);
        for (T member: team){
            System.out.println("- " + member.getName() + " (" + member.getRole() + ")");
        }
    }
}







