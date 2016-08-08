package mario;
import java.util.List;
import java.util.ArrayList;
import mario.outputStrategies.*;

public class Pyramid {
    // GLOBAL PROPERTIES
    private List<String> pyramid = new ArrayList();
    private int mHeight;  
    private OutputStrategy outputStrategy = new PrintOutputStrategy();
    
    //METHODS:
    public int getHeight(){
        return mHeight;
    }
    
    public Pyramid(int height){        
        mHeight = height;          
        setPyramid();
    }
       
    private void setPyramid(){
        // Creating the pyramid and puting it into the pyramid ArrayList
        int wSpaces = mHeight;
        String pyramidLn;
        do{
            pyramidLn = repeatChar(wSpaces, ' ');
            pyramidLn += repeatChar(mHeight - wSpaces + 2, '#');
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
    
//    public void output(){
//        // Selecting the output method.
//        if (mOutputMethod == 0) {
//            printPyramid();
//        }else {
//            filePyramid();
//        }
//    }     
    

}
