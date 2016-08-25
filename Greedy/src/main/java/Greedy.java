import java.util.Scanner;

public class Greedy {
    public static void main(String[] varArgs) {
        CoinCalculator coinCalculator = new CoinCalculator(new AmericanCoinSet());
        System.out.println(coinCalculator.calculateChange(promptCashier()));
    }

    public static String promptCashier(){
        System.out.print("Enter the amount of change:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}