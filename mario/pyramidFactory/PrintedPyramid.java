
package mario.pyramidFactory;
import mario.pyramidFactory.Pyramid;
import mario.outputStrategies.PrintOutputStrategy;
// Filed type of pyramid
public class PrintedPyramid extends Pyramid{
    public PrintedPyramid(int height) {        
        super(height); 
        super.setOutputStrategy(new PrintOutputStrategy());
    }  
    
    @Override
    public String toString(){
        return super.toString() + "which is going to be printed.";
    }
}
