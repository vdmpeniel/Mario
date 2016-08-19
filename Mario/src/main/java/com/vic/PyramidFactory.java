package com.vic;
import com.vic.pyramidFactory.Pyramid;
import com.vic.pyramidFactory.PrintedPyramid;
import com.vic.pyramidFactory.FiledPyramid;

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