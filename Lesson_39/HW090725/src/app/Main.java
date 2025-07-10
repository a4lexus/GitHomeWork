package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("ann");
        list.add("kim");
        list.add("lena");
        list.add("nick");
        System.out.println("Исходный лист: " + list);
        System.out.println("----------------------");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() < 4) {
                iterator.remove();
            }
        }
        System.out.println("После удаления имён короче 3 букв: " + list);

        Iterator<String> iterator2 = list.iterator();
        String result = "";
        while (iterator2.hasNext()) {
            result += iterator2.next();
            if (iterator2.hasNext()) {
                result += ",";
            }
        }

        System.out.println("Результат: " + result);
    }
}




