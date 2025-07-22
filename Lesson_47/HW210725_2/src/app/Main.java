package app;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
2.
[поиск однофамильцев] Дан лист Person(firstName,lastName, age)  ваша задача получить Map<String,
List<Person>> где ключ lastName, значение список Person с соответствующим lastName
 */
public class Main {
    public static void main(String[] args) {

        List<Person> list = List.of(
                new Person("Ivan", "Ivanov", 23),
                new Person("Petya", "Petrov", 21),
                new Person("Vasya", "Vasilyev", 20),
                new Person("Kolya", "Sergeev", 19),
                new Person("Lena", "Lenina", 25),
                new Person("Olya", "Ivanov", 28)

        );

        Map<String, List<Person>> groupByLastName = list.stream()
                .collect(Collectors.groupingBy(Person::getLastName));
        System.out.println(groupByLastName);


    }
}
