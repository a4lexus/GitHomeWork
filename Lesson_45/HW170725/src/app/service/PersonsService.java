package app.service;

import app.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PersonsService {
    public static <T> List<T> getInfo(List<Person> list, PersonToStringFunction function){
        List<T> result = new ArrayList<>();
        for (var element: list){
            result.add((T) function.apply(element));
        }
        return result;
    }

    public static <T,R> List<R> getInfo(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (var element: list){
            result.add(function.apply(element));
        }
        return result;
    }



    public static <T> void print(List<T> list){
        for (T element:list){
            System.out.println(element);
        }
    }

}
