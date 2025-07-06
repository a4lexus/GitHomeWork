package app;

import java.util.Comparator;

public class ComparatorQuantityInStock implements Comparator<OnlineStore> {
    @Override
    public int compare(OnlineStore o1, OnlineStore o2) {
        if (o1.getQuantityInStock() > o2.getQuantityInStock()){
            return 555;
        }else if (o1.getQuantityInStock() < o2.getQuantityInStock()){
            return -555;
        }else {
            return 0;
        }
    }
}
