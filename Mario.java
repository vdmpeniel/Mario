package mario;
import java.io.*;
import java.util.*;

//Let us build a half pyramid for our friend Mario!
public class Mario {
    
    public static String repeatChar(int num, char ch){
        //Using StringBuilder instead of concatenations for better performance
        StringBuilder mult = new StringBuilder(); 
        for(int i = 0; i < num; i++){
            mult.append(ch);
        }
        return mult.toString();
    }
    
    public static void createPyramid(int num){
        String pyramidLn;
        int wSpaces = num;
        do{
            pyramidLn = repeatChar(wSpaces, ' ');
            pyramidLn += repeatChar(num - wSpaces + 2, '#'); 
            System.out.println(piramidLn);
        }while( --wSpaces > 0);        
    }
    
    public static int getInput(){
        Scanner in = new Scanner(System.in); 
        int n;
        
        //input and input validation
        do{
            System.out.print(" Enter the size of your half pyramid: ");
            n = in.nextInt();
        }while(n < 0 || n > 23);
        
        System.out.println("");
        return n;
    }
    
    public static void  main(String[] args){
        int height = getInput();      
        createPyramid(height);
    }  
}
