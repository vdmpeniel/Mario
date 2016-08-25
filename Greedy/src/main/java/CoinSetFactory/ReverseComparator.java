package CoinSetFactory;

import java.util.Comparator;

//Reverse sorting order for the coinSet TreeMap
public class ReverseComparator implements Comparator<Integer> {
    public int compare(Integer int1, Integer int2) {
        if(int1.compareTo(int2) < 1){return 1;}
        if(int1.compareTo(int2) > 1){return -1;}
        return 0;
    }
}
