package mario;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private int outputMethod;
    
    private int getInput(){
        // General input method 
        int n = 0;
        try{
            Scanner in = new Scanner(System.in);            
            n = in.nextInt();            
        } catch(InputMismatchException e){
          System.out.println("WARNING: Only numbers are allowed.");
        } 
        return n;
    }
    
    public int inputOutputMethod(){
        // Getting input method from user; think of a better name
        do {
            System.out.println("How do you want your pyramid?");
            System.out.println("0 - For on the screen output.");
            System.out.println("1 - For output on a file.");
            System.out.print(">> ");
            outputMethod = getInput();
        }while(outputMethod < 0 || outputMethod > 1);
        return outputMethod;
    }
    
    public int inputHeight(){        
        // Height input and input validation
        int n;
        do{
            System.out.println("Enter the size of your half pyramid(1 - 23): ");
            System.out.print(">> ");
            n = getInput();
        }while(n < 1 || n > 23);

        System.out.println("");
        return n;
    }
}
