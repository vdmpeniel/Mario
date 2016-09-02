package CoinSetFactory;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class EuroCoinSet implements CoinSet{
    private enum Coins{
        TWO_EUROS     (200, "two euros coin"),
        ONE_EURO      (100, "one euro coin"),
        FIFTY_CENTS   (50, "fifty euro cents coin"),
        TWENTY_CENTS  (20, "twenty euro cents coin"),
        TEN_CENTS     (10, "ten euro cents coin"),
        FIVE_CENTS    (5, "five euro cents coin"),
        ONE_CENT      (1, "one euro cent coin");
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

