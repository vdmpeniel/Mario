package mario;
/*  This commit is al about separating UX from 
 *  the pyramid reation and implementing the 
 *  Strategy Design Pattern.
 *  Comments are also going to be added
 */ 
public class Mario {
    public static void  main(String[] args){
        UserInterface ui = new UserInterface();
        Pyramid py = new Pyramid(ui.inputHeight(),ui.inputOutputMethod()); 
        py.output();
    }
}