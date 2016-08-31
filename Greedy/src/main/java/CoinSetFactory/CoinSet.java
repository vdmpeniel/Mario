package CoinSetFactory;

import java.util.Map;
import java.util.TreeMap;

public class CoinSet {
    private Map<Integer, String> coinSet = new TreeMap<>(new ReverseComparator());

    public CoinSet(Map<Integer, String> coinSet){
        this.coinSet = coinSet;
    }

    public Map<Integer, String> getCoinSet(){
        return coinSet;
    }
}
