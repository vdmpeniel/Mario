package mario;
import mario.outputStrategies.FileOutputStrategy;

public class Mario {
    public static void  main(String[] args){
        UserInterface ui = new UserInterface(); // Calling UI
        Pyramid py = new Pyramid(ui.inputHeight()); // Creating pyramid       
        if(ui.inputOutputMethod() == 1) { py.setOutputStrategy(new FileOutputStrategy()); } // Setting output method if diferent than printing
        py.postOutput(); //Outputing the pyramid, using the method selected 
    }
}
