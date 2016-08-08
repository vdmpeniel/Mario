
package mario.pyramidFactory;
import mario.pyramidFactory.Pyramid;
import mario.outputStrategies.FileOutputStrategy;

public class FiledPyramid extends Pyramid{
    
    public FiledPyramid(int height) {        
        super(height); 
        super.setOutputStrategy(new FileOutputStrategy());
    }    
}