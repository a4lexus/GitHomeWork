package app;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
1.Дан лист строк, нужно получить Map<String, Boolean>, где ключ - строка,
значение - true, если строка встретилась более одного раза, иначе false
Естественно, решить используя Stream.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack", "John", "Jim", "Jack", "John");

        Map<String, Boolean> stringBooleanMap = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.collectingAndThen(Collectors.counting(), c -> c > 1)
                ));
        System.out.println(stringBooleanMap);


    }
}
