import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * Created by Vic:D on 8/24/2016.
 */
public class Greedy {
    public static void main(String[] varArgs) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        CoinCalculator coinCalculator = new CoinCalculator(new AmericanCoinSet());
        System.out.println(coinCalculator.calculateChange(input));
    }
}