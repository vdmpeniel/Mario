import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by wiwi on 8/24/2016.
 */
public class CoinCalculatorTest {
    @Test
    public void zeroCoinsTest(){
        CoinCalculator coinCalculator = new CoinCalculator(new EuroCoinSet());
        String answer = coinCalculator.calculateChange("30.00");
        assertEquals("No coins returned", answer);
    }

    @Test
    public void cents(){
        CoinCalculator coinCalculator = new CoinCalculator(new AmericanCoinSet());
        String answer = coinCalculator.calculateChange("0.04");
        assertEquals("4 pennys", answer);
    }

}