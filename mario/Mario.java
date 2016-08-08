package mario;
import mario.outputStrategies.FileOutputStrategy;

public class Mario {
    public static void  main(String[] args){
        UserInterface ui = new UserInterface();
        Pyramid py = new Pyramid(ui.inputHeight());        
        if(ui.inputOutputMethod() == 1) { py.setOutputStrategy(new FileOutputStrategy()); }
        py.postOutput();
    }
}