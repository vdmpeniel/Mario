package mario;
import java.io.*;
import java.util.*;

public class Mario {
    
    public static String repeatChar(int num, char ch){
        //Using StringBuilder instead of concatenations for better performance
        StringBuilder mult = new StringBuilder(); 
        for(int i = 0; i < num; i++){
            mult.append(ch);
        }
        return mult.toString();
    }
    
    public static void createPiramid(int num){
        String piramidLn;
        int wSpaces = num;
        do{
            piramidLn = repeatChar(wSpaces, ' ');
            piramidLn += repeatChar(num - wSpaces + 2, '#'); 
            System.out.println(piramidLn);
        }while( --wSpaces > 0);        
    }
    
    public static int getInput(){
        Scanner in = new Scanner(System.in); 
        int n;
        
        //input and input validation
        do{
            System.out.print(" Enter the size of your half piramid: ");
            n = in.nextInt();
        }while(n < 0 || n > 23);
        
        System.out.println("");
        return n;
    }
    
    public static void  main(String[] args){
        int height = getInput();      
        createPiramid(height);
    }  
}
