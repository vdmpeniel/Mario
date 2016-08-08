package mario;
import mario.pyramidFactory.Pyramid;
import mario.pyramidFactory.PrintedPyramid;
import mario.pyramidFactory.FiledPyramid;

public class PyramidFactory {
   public Pyramid make(int height, int type){      
       if(type == 0) {  
          return new PrintedPyramid(height);
       } else {
          return new FiledPyramid(height);
       }               
   }
}