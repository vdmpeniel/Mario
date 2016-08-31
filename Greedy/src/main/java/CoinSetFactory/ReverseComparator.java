package CoinSetFactory;

import java.util.Comparator;

//Reverse sorting order for the coinSet TreeMap
public class ReverseComparator implements Comparator<Integer> {
    public int compare(Integer int1, Integer int2) {
        return int2.compareTo(int1);
    }
}
