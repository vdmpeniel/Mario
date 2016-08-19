package com.vic;
import com.vic.pyramidFactory.Pyramid;

public class Mario {
    private Pyramid pyramid;
    private PyramidFactory factory = new PyramidFactory();// Creating factory


    public void makePyramid(int height, int outputMethod){
        pyramid = factory.build(height, outputMethod); // Creating pyramid
        System.out.println(pyramid.toString()); // Printing toString message
        pyramid.postOutput(); // Outputting the pyramid, using the method selected
    }
}
