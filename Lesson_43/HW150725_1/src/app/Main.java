package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List <Task> tasks = List.of(
        new Task(1, "могу копать!"), // задачи взяты из анекдота 😄
        new Task(2, "могу не копать!"),
        new Task(3, "могу мешки держать!"),
        new Task(4, "могу мешки завязывать!")
        );
        System.out.println("--------------------------------------------------");
        Map<Programmer,List<Task>> result = programmerListMap(tasks);
        for (var entry: result.entrySet()){
            System.out.println(entry.getKey());
        }
    }

    public static Map<Programmer, List<Task>> programmerListMap(List<Task> list){
    Map<Programmer,List<Task>> tasks = new HashMap<>();
    for (Task task: list) {
        Programmer programmer = Programmer.createProgrammer(task.getNumber());
        List<Task> taskList = tasks.computeIfAbsent(programmer, k -> new ArrayList<>());
        taskList.add(task);
        programmer.setTasks(taskList);
    }

    return tasks;

    }
}



