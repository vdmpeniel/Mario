import java.util.Scanner;

public class Greedy {
    public static void main(String[] varArgs) {
        String input = promptCashier();
        CoinCalculator coinCalculator = new CoinCalculator();
        System.out.println(coinCalculator.calculateChange(input));
    }


    public static String promptCashier(){
        System.out.print("Enter the amount of change:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}