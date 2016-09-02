package CoinSetFactory;
import java.util.Map;

public interface CoinSet {
    enum Coins{}
    Map<Integer, String> toMap();
}
