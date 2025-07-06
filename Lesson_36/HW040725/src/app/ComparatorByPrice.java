package app;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<OnlineStore> {

    @Override
    public int compare(OnlineStore o1, OnlineStore o2) {
        if (o1.getPrice() > o2.getPrice()){
            return 555;
        }else if (o1.getPrice() < o2.getPrice()){
            return -555;
        }else {
            return 0;
        }
    }
}
