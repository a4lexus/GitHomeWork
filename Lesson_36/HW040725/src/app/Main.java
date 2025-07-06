package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OnlineStore> onlineStores = List.of(
                new OnlineStore("jacket", 57,4.5, 5),
                new OnlineStore("shorts", 35, 4.7,9),
                new OnlineStore("dress", 119, 4.9,4),
                new OnlineStore("t-shirt", 15, 4.3,23),
                new OnlineStore("jeans", 69, 4.8,15),
                new OnlineStore("socks", 3, 4.7,69)
        );
        List<OnlineStore> onlineStoreList = new ArrayList<>(onlineStores);
        System.out.println("-----------список товара------------");
        System.out.println(onlineStoreList);

        System.out.println("---по названию товара(Comparable)---");
        Collections.sort(onlineStoreList);
        System.out.println(onlineStoreList);

        System.out.println("--------- по рейтингу --------------");
        Collections.sort(onlineStoreList,new ComparatorByRating());
        System.out.println(onlineStoreList);

        System.out.println("------ по цене по возрастанию-------");
        Collections.sort(onlineStoreList,new ComparatorByPrice());
        System.out.println(onlineStoreList);

        System.out.println("------- по цене по убыванию---------");
        ComparatorByPrice comparatorByPrice = new ComparatorByPrice();
        Collections.sort(onlineStoreList,comparatorByPrice.reversed());
        System.out.println(onlineStoreList);

        System.out.println("----- по количеству на складе ------");
        Collections.sort(onlineStoreList,new ComparatorQuantityInStock());
        System.out.println(onlineStoreList);

    }
}
