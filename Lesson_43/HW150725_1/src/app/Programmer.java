package app;

import java.util.List;
import java.util.Objects;

public class Programmer {
    private int id;
    private String name;
    private List<Task> tasks;

    public Programmer(int id) {
        this.id = id;
        this.name = "Programmer #" + id;

    }

    public static Programmer createProgrammer(int number) {
        String[] names = {"Алексей", "Дмитрий", "Ольга", "Татьяна"};
        String name = names[(number - 1) % names.length];
        Programmer programmer = new Programmer(number);
        programmer.setName(name);
        return programmer;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programmer)) return false;
        Programmer that = (Programmer) o;
        return id == that.id;

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return " 👨‍💻 " + name + " " + tasks;
    }
}
