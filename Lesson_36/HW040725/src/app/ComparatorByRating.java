package app;

import java.util.Comparator;

public class ComparatorByRating implements Comparator<OnlineStore> {
    @Override
    public int compare(OnlineStore o1, OnlineStore o2) {
        if (o1.getRating() > o2.getRating()){
            return 555;
        }else if (o1.getRating() < o2.getRating()){
            return -555;
        }else {
            return 0;
        }
    }
}
