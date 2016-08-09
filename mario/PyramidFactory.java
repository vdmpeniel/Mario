package mario;
import mario.pyramidFactory.Pyramid;
import mario.pyramidFactory.PrintedPyramid;
import mario.pyramidFactory.FiledPyramid;
//Pyramid factory
public class PyramidFactory {
   public Pyramid build(int height, int type){  
       if(type == 0) {  
          return new PrintedPyramid(height);
       } else {
          return new FiledPyramid(height);
       }               
   }
}