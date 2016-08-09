package mario;
import java.io.*;
import mario.pyramidFactory.Pyramid;

public class MarioSingleton {
    
    private Pyramid pyramid;
    private PyramidFactory factory = new PyramidFactory();// Creating factory    
    private static MarioSingleton onlyOne = null;
    
    private MarioSingleton(){                
    }
    
    public static MarioSingleton getInstance(){
        if(onlyOne == null){
            onlyOne = new MarioSingleton();
        }
        return onlyOne;
    }
    
    public void makePyramid(int height, int outputMethod){
        pyramid = factory.build(height, outputMethod); // Creating pyramid
        System.out.println(pyramid.toString()); // Prnting toString message
        pyramid.postOutput(); // Outputting the pyramid, using the method selected
        
    }
}
