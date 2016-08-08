package mario;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;

public class UserInterface {
    private int height = 0;
    private int outputMethod = 0;
    
    private int getInput(){
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
        int n;
        //height input and input validation
        do{
            System.out.println("Enter the size of your half pyramid(1 - 23): ");
            System.out.print(">> ");
            n = getInput();
        }while(n < 1 || n > 23);

        System.out.println("");
        return n;
    }
}
