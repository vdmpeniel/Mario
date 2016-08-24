import java.security.PublicKey;
import java.util.Map;

/**
 * Created by Vic:D on 8/23/2016.
 */
public class CoinCalculator {
    CoinSet coinSet;
    StringBuilder answer = new StringBuilder();

    public CoinCalculator(CoinSet coinSet){
        this.coinSet = coinSet;
    }

    public String calculateChange(String input){
        //Getting change from input
        input = input.replaceAll("\\D+","");//Only digits
        Integer change = Integer.parseInt(input.substring(input.length() - 3));//Last 3 digits

        //Looping through the coin set.
        for(Map.Entry coin : coinSet.getCoinSet().entrySet()){
            //Extracting values
            int coinValue = (int)coin.getKey();
            String coinName = (String) coin.getValue();

            int mod = change % coinValue;
            // If mod is bigger than change that coin won't serve
            if(mod < change) {
                int div = change / coinValue;

                //Creating answer
                answer.append(div).append(" ").append(coinName);
                if(div > 1) answer.append("s");
                answer.append("\n");

                //Updating change
                change = mod;
            }

        }
        return answer.toString();
    }
}
