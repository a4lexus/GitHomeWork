package app;

import java.util.Objects;

public class Task {
    private int number;
    private String description;

    public Task(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return number == task.number && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, description);
    }

    @Override
    public String toString() {
        return "задача" + number + ": " +  description ;
    }
}
