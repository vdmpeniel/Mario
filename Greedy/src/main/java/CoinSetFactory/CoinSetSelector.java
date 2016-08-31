package CoinSetFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CoinSetSelector {

    public CoinSet select(char currency){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CoinSet coinSet = null;

        switch (currency){
            case '$': coinSet = (CoinSet) context.getBean("americanCoinSet");
            break;
            case '€': coinSet = (CoinSet) context.getBean("euroCoinSet");
            break;
        }
        return coinSet;
    }
}
