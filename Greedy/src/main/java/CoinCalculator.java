import CoinSetFactory.CoinSet;
import CoinSetFactory.CoinSetSelector;

import java.util.Map;
public class CoinCalculator {
    CoinSet coinSet;
    StringBuilder answer = new StringBuilder();

    public void setCoinSet(CoinSet coinSet){
        this.coinSet = coinSet;
    }

    public String calculateChange(String input){
        extractCurrency(input);
        Integer change = extractChange(input);

        for(Map.Entry coin : coinSet.toMap().entrySet()) {
            int coinValue = (int) coin.getKey();
            String coinName = (String) coin.getValue();
            int mod = change % coinValue;

            if (mod < change) {
                int div = change / coinValue;
                answer = createAnswer(answer, div, coinName);
                change = mod;
            }
        }
        if (answer.length() == 0) answer.append("No coins returned");
        return answer.toString().trim();
    }

    private void extractCurrency(String input){
        char currency = input.trim().charAt(0);
        try {
            CoinSetSelector coinSetSelector = new CoinSetSelector();
            setCoinSet(coinSetSelector.select(currency));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private Integer extractChange(String input){
        input = input.replaceAll("\\D+","");
        return Integer.parseInt(input.substring(input.length() - 3));
    }

    private StringBuilder createAnswer(StringBuilder answer, int div, String coinName){
        answer.append(div).append(" ").append(coinName);
        if(div > 1) answer.append("s");
        answer.append("\n");
        return answer;
    }
}
