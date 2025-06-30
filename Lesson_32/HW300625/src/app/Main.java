package app;

import app.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alexej", "Cohort-68"));
        students.add(new Student("Igor", "Cohort-68"));
        students.add(new Student("Olga", "Cohort-68"));
        students.add(new Student("Dima", "Cohort-68"));
        students.add(new Student("Tatjana", "Cohort-68"));
        students.add(new Student("Alex", "Cohort-68"));
        students.add(new Student("Natalia", "Cohort-68"));
        students.add(new Student("Wasilij", "Cohort-68"));
        students.add(new Student("Ruslana", "Cohort-68"));
        students.add(new Student("Pavel", "Cohort-68"));
        students.add(new Student("Aider", "Cohort-68"));
        students.add(new Student("Alexander", "Cohort-68"));
        students.add(new Student("Anton", "Cohort-68"));
        students.add(new Student("Natali", "Cohort-68"));
        System.out.println("--------------------------------------------");

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Всего студентов: " + Student.howManyStudent());
        System.out.println("Студенты у которых имя начинается на 'Alex': ");
        printStudentsWithName(students, "Alex");
    }
    public static void printStudentsWithName(List<Student> students, String prefix) {
        int count = 0;
        for (Student student : students) {
            if (student.getName().toLowerCase().startsWith(prefix.toLowerCase())) {
                count++;
                System.out.println(student);

            }
        }
    }

}

