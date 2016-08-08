package mario;
public class Mario {
    public static void  main(String[] args){
        UserInterface ui = new UserInterface();
        Pyramid py = new Pyramid(ui.inputHeight(),ui.inputOutputMethod()); 
        py.output();
    }
}