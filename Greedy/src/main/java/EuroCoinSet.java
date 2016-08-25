import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import java.util.TreeMap;

public class EuroCoinSet implements CoinSet{
    private Map<Integer, String> coinSet = new TreeMap<>(new ReverseComparator());

    public EuroCoinSet(){
        coinSet.put(200, "two euros coin");
        coinSet.put(100, "one euro coin");
        coinSet.put(50, "fifty euro cents coin");
        coinSet.put(20, "twenty euro cents coin");
        coinSet.put(10, "ten euro cents coin");
        coinSet.put(5, "five euro cents coin");
        coinSet.put(2, "two euro cents coin");
        coinSet.put(1, "one euro cent coin");
    }

    public Map<Integer, String> getCoinSet(){
        return coinSet;
    }
}