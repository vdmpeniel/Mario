import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Greedy {
    public static void main(String[] varArgs) {
        String input = promptCashier();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CoinCalculator coinCalculator = (CoinCalculator) context.getBean("coinCalculator");
        System.out.println(coinCalculator.calculateChange(input));
    }


    public static String promptCashier(){
        System.out.print("Enter the amount of change:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}