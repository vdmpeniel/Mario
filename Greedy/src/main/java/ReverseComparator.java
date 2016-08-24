import java.util.Comparator;

/**
 * Created by Vic:D on 8/24/2016.
 */

//Reverse sorting order for the coinSet TreeMap
public class ReverseComparator implements Comparator<Integer> {
    public int compare(Integer int1, Integer int2) {
        //compareTo in String classs
        if(int1.compareTo(int2) < 1){return 1;}
        if(int1.compareTo(int2) > 1){return -1;}
        return 0;
    }
}
