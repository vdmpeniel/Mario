package com.vic.outputStrategies;
import java.util.List;

public class PrintOutputStrategy implements OutputStrategy{
    public void output(List<String> pyramid){
        // Printing the pyramid collection
        for(String line : pyramid) {
            System.out.println(line);
        }
    }
}
