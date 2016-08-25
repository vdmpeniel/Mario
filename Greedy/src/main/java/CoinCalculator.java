import java.security.PublicKey;
import java.util.Map;
public class CoinCalculator {
    CoinSet coinSet;
    StringBuilder answer = new StringBuilder();

    public CoinCalculator(CoinSet coinSet){
        this.coinSet = coinSet;
    }

    public String calculateChange(String input){
        Integer change = processInput(input);

        for(Map.Entry coin : coinSet.getCoinSet().entrySet()){
            int coinValue = (int)coin.getKey();
            String coinName = (String) coin.getValue();
            int mod = change % coinValue;

            if(mod < change) {
                int div = change / coinValue;
                answer = createAnswer(answer, div, coinName);
                change = mod;
            }
        }
        if (answer.length() == 0) answer.append("No coins returned");
        return answer.toString().trim();
    }


    public StringBuilder createAnswer(StringBuilder answer, int div, String coinName){
        answer.append(div).append(" ").append(coinName);
        if(div > 1) answer.append("s");
        answer.append("\n");
        return answer;
    }

    public Integer processInput(String input){
        input = input.replaceAll("\\D+","");
        return Integer.parseInt(input.substring(input.length() - 3));
    }
}
