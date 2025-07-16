package app;
/*
Допустим вы продаете автомобили. Т.е. есть класс Auto. У каждой машины есть номер (id), бренд, год выпуска, цена.
У вас есть список автомобилей.
Ваша программа должна уметь получать список автомобилей отсортированный по:
 номеру, цене, году выпуска, бренду
Естественно, вам придется реализовать соответствующие компараторы. Естественно, реализовывать нужно лямбда-выражением.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Auto> list;
        list = new ArrayList<>(List.of(
                new Auto(1 ,"BMW", 2022, 35000),
                new Auto(2 ,"LADA", 1989, 900),
                new Auto(3,"Tesla", 2021, 39000),
                new Auto(4 ,"Audi", 2020, 42000),
                new Auto(5 ,"Honda", 2005, 3500),
                new Auto(6 ,"Toyota", 2021, 5000),
                new Auto(7 ,"Tesla", 2024, 44000),
                new Auto(8 ,"Mercedes", 2019, 55000)
        ));
        PredicateAuto predicate = new PredicateAuto() {

            @Override
            public boolean check(Auto auto) {
                return auto.getBrand().equalsIgnoreCase("Tesla");
            }
        };
        System.out.println("==== сортируем по марке ========");
        System.out.println(filter(list,predicate));

        System.out.println("==== сортируем по году =========");
        System.out.println(filter(list,(Auto auto)-> { return auto.getYear() <=2020; } ));

        System.out.println("==== сортируем по номеру =======");
        System.out.println(filter(list,(Auto auto ) -> {return auto.getId() > 5; } ));

        System.out.println("====== сортируем по цене =======");
        list.sort((Auto a1, Auto a2) -> { return Integer.compare(a1.getPrice(),a2.getPrice());} );
        System.out.println(list);

    }
    public static List<Auto> filter(List<Auto> list, PredicateAuto predicateAuto) {
        List<Auto> result = new ArrayList<>();
        for (Auto auto: list){
            if (predicateAuto.check(auto)){
                result.add(auto);
            }
        }
        return result;
    }

}
