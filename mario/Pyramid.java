package mario;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Pyramid {
    private List<String> pyramid = new ArrayList();
    private int mHeight;  
    private int mOutputMethod;
    
    public int getHeight(){
        return mHeight;
    }
    
    public int getOuputMethod(){
        return mOutputMethod;
    } 
    
    
    public Pyramid(int height, int outputMethod){        
        mHeight = height;
        mOutputMethod = outputMethod;        
        setPyramid();
    }
       
    
    private void setPyramid(){
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
    

    private void filePyramid() {        
        File file = new File("pyramid.txt");        
        try(PrintWriter out = new PrintWriter(file);) {            
            for (String line : pyramid) {
                out.println(line);
            }
            System.out.println("Your pyramid was saved into pyramid.txt");
        } catch (IOException e) {
            System.out.println("There was an error trying to write the pyramid to a file!");
            System.out.println(e.getMessage());
        } 
    }

    private void printPyramid(){
        for(String line : pyramid) {
            System.out.println(line);
        }
    }
    
    public void output(){
        if (mOutputMethod == 0) {
            printPyramid();
        }else {
            filePyramid();
        }
    }     
    

}
