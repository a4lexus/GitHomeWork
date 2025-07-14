package app;

import java.util.*;

/*
Дан лист строк, необходимо получить Map<String,Boolean>  где ключ, это строка,
а значение true - если строка встретилась в листе только один раз, false - если встретилась больше одного раза
*/
public class Main2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Jan");
        stringList.add("Chen");
        stringList.add("Chan");
        stringList.add("Chin");
        stringList.add("Jan");
        stringList.add("Chan");
        System.out.println("Исходный лист:\n" + stringList);
        System.out.println("|================================|");

        Map<String,Boolean> resultMap = new LinkedHashMap<>();
        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String str : stringList){
            countMap.put(str, countMap.getOrDefault(str,0) + 1);
        }
        for (Map.Entry<String,Integer> entry: countMap.entrySet()){
            resultMap.put(entry.getKey(), entry.getValue() == 1);
        }
        for (Map.Entry<String,Boolean> entry: resultMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

