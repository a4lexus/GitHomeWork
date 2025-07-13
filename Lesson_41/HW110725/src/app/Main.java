package app;
/*
Дан лист String. Необходимо определить, есть ли в данном листе повторяющиеся строки.
Дана строка с именами вида Jack, John, Nick, John. Необходимо написать метод, который
удалит из этой строки повторяющиеся имена. Т.е. Например, в случае строки “Jack, John, Nick, John”
вернет строку с именами Jack, John, Nick
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
         List<String> arrayList = new ArrayList<>();
            arrayList.add("Jack");
            arrayList.add("John");
            arrayList.add("Nick");
            arrayList.add("John");

      Iterator<String> iterator = arrayList.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
        List<String> list = List.of("Jack", "John","Nick", "John");

        System.out.println(" Исходный лист: " + list);
        System.out.println("Без дубликатов: " + removeDuplicate(list));

    }

    public static List<String> removeDuplicate(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    };
}


