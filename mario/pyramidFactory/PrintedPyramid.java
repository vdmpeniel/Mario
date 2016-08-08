
package mario.pyramidFactory;
import mario.pyramidFactory.Pyramid;
import mario.outputStrategies.PrintOutputStrategy;

public class PrintedPyramid extends Pyramid{
    public PrintedPyramid(int height) {        
        super(height); 
        super.setOutputStrategy(new PrintOutputStrategy());
    }    
}
