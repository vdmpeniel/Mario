import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import java.util.TreeMap;

public class AmericanCoinSet implements CoinSet{
    private Map<Integer, String> coinSet = new TreeMap<>(new ReverseComparator());

    public AmericanCoinSet(){
        coinSet.put(100, "dollar");
        coinSet.put(25, "quarter");
        coinSet.put(10, "dime");
        coinSet.put(5, "nickel");
        coinSet.put(1, "penny");

    }

    public Map<Integer, String> getCoinSet(){
        return coinSet;
    }
}
