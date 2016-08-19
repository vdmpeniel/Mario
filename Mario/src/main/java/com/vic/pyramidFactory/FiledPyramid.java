
package com.vic.pyramidFactory;
import com.vic.outputStrategies.FileOutputStrategy;

// Filed type of pyramid
public class FiledPyramid extends Pyramid{
    
    public FiledPyramid(int height) {        
        super(height); 
        super.setOutputStrategy(new FileOutputStrategy());
    } 
    
    @Override
    public String toString(){
        return super.toString() + "which is going to be filed.";
    }
    
}