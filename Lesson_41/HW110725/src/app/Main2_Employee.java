package app;
/*
[по желанию] Руководство компании решило премировать сотрудников.
 Каждый team lead подал список сотрудников для получения премии.
 Но получилось так, что некоторые сотрудники работают на нескольких проектах и попали в списки несколько раз.
Итак, у вас есть массив из списков Employee.
Ваша задача помочь получить один общий список сотрудников, но без повторов.
*/
import java.util.*;

    public class Main2_Employee {
        public static void main(String[] args) {
            String[] employeeList = {
            "Nick", "Jack", "Mike",
            "Mike", "John", "Nick",
            "Lena", "Jack", "Tom"
        };

            Set<String> uniqueEmployees = new HashSet<>(); // Используем Set для устранения повторов

            for (String name : employeeList) {
                uniqueEmployees.add(name);
            }
            List<String> result = new ArrayList<>(uniqueEmployees);
            System.out.println("Итоговый список сотрудников:");
            for (String employee : result) {
                System.out.println(employee);
            }
        }
    }



