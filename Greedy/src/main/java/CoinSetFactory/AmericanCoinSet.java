package CoinSetFactory;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AmericanCoinSet implements CoinSet{
    private enum Coins{
        DOLLAR  (100, "dollar"),
        QUARTER (25, "quarter"),
        DIME    (10, "dime"),
        NICKEL  (5, "nickel"),
        PENNY   (1, "penny");
        private final Integer value;
        private final String name;

        Coins(Integer value, String name){
            this.value = value;
            this.name = name;
        }
    }

    public Map<Integer, String> toMap(){
        Map<Integer, String> map = new TreeMap<>( new ReverseComparator());
        for(Coins coin : Coins.values()){
            map.put (coin.value, "" + coin.name);
        }
        return map;
    }
}
