package app;

import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        List<Programmer> programmers = List.of(
                new Programmer("Jack", "New York", List.of(
                        new Task(1, "написать метод", "в ожидании", 6),
                        new Task(2, "исправить ошибки", "в процессе", 3)
                )),
                new Programmer("Anna", "Berlin", List.of(
                        new Task(5, "написать скрипт", "готово", 4),
                        new Task(8, "создать класс", "в процессе", 3),
                        new Task(6, "почистить базу", "в ожидании", 5)
                )),
                new Programmer("Marko", "Zadar", List.of(
                        new Task(4, "Оптимизировать запрос", "в ожидании", 2),
                        new Task(7, "написать тест", "в процессе", 7),
                        new Task(9, "Оптимизировать код", "в ожидании", 2)
                ))
        );

        Map<String, Integer> taskCount = programmers.stream()
                .collect(Collectors.toMap(
                        Programmer::getName,
                        p -> p.getTasks().size()
                ));
        System.out.println("======= Список программистов и кол-во задач ======");
        taskCount.forEach((name, count) ->
                System.out.println(name + ": " + count)
        );

        System.out.println("===========Список задач из Берлина ===============");
        List<Task> list = programmers.stream()
                .filter(p->p.getCity().equalsIgnoreCase("Berlin"))
                .flatMap(p->p.getTasks().stream())
                .filter(task -> !task.getStatus().equalsIgnoreCase("готово"))
                .sorted(Comparator.comparingInt(Task::getDaysInProcessing))
                .collect(Collectors.toList());
        list.forEach(task -> System.out.println(task.getDescription() + ": " + task.getDaysInProcessing() + " дн(я)ей"));

        System.out.println("==========  Список задач не из Берлина ==============");

        Set<Task> filteredTasks = programmers.stream()
                .filter(p -> !p.getCity().equalsIgnoreCase("Berlin"))
                .flatMap(t->t.getTasks().stream())
                .filter(t->t.getDaysInProcessing() > 5)
                .filter(t -> !t.getStatus().equalsIgnoreCase("готово"))
                .collect(Collectors.toSet());
        filteredTasks.forEach(task -> System.out.println(task.getDescription() + ": " + task.getDaysInProcessing()
                + " статус: " + task.getStatus()));
    }
}

