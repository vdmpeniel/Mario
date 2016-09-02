package CoinSetFactory;


public class CoinSetSelector {

    public CoinSet select(char currency){
        CoinSet coinSet = null;
        switch (currency){
            case '$': coinSet = new AmericanCoinSet();
            break;
            case '€': coinSet = new EuroCoinSet();
            break;
            default: throw new IllegalArgumentException("Currency not defined");
        }
        return coinSet;
    }
}

