package mario.pyramidFactory;
import java.util.List;
import java.util.ArrayList;
import mario.outputStrategies.*;

public abstract class Pyramid {
    // GLOBAL PROPERTIES
    private List<String> pyramid = new ArrayList();
    private int height;  
    private OutputStrategy outputStrategy;
    
    //METHODS:
    public int getHeight(){
        return height;
    }
    
    public Pyramid(int height){        
        this.height = height;          
        setPyramid();
    }
       
    private void setPyramid(){
        // Creating the pyramid and puting it into the pyramid ArrayList
        int wSpaces = height;
        String pyramidLn;
        do{
            pyramidLn = repeatChar(wSpaces, ' ');
            pyramidLn += repeatChar(height - wSpaces + 2, '#');
            pyramid.add(pyramidLn);
        }while( --wSpaces > 0);
    }
    
    private String repeatChar(int num, char ch){
        //Using StringBuilder instead of concatenations for better performance
        StringBuilder mult = new StringBuilder();
        for(int i = 0; i < num; i++){
            mult.append(ch);
        }
        return mult.toString();
    }
    

    public void setOutputStrategy(OutputStrategy outputStrategy){
        this.outputStrategy = outputStrategy;
    }
    
    public void postOutput(){
        outputStrategy.output(pyramid);
    }
    
    @Override
    public String toString(){
        return String.format("This is a pyramid of %s steps of height, ", height);
    }
}
