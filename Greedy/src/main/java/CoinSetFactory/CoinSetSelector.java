package CoinSetFactory;
public class CoinSetSelector {
    private CoinSet coinSet;

    private void setCoinSet(CoinSet coinSet){
        this.coinSet = coinSet;
    }

    public CoinSet select(char currency){
        switch (currency){
            case '$': setCoinSet(new AmericanCoinSet());
            break;
            case '€': setCoinSet(new EuroCoinSet());
            break;
        }
        return coinSet;
    }
}
