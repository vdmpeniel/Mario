package com.vic.outputStrategies;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileOutputStrategy implements OutputStrategy{
    public void output(List<String> pyramid){
        // Saving the pyramid collection in a text file
        File file = new File("pyramid.txt"); 
        try(PrintWriter out = new PrintWriter(file);) { //This is what is called as a try with resources, in which files do not have to be closed.
            for (String line : pyramid) {
                out.println(line);
            }
            System.out.println("Your pyramid was saved into pyramid.txt");
        } catch (IOException e) {
            System.out.println("There was an error trying to write the pyramid to a file!");
            System.out.println(e.getMessage());
        }
    }
    
}
