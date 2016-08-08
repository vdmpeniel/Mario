//THIS IS THE COMMIT FOR FIXED CONFLICTS
package mario;
import mario.pyramidFactory.Pyramid;


public class Mario {
    public static void  main(String[] args){
        UserInterface ui = new UserInterface(); // Calling UI
        PyramidFactory mariosFactory = new PyramidFactory();// Creating factory
        Pyramid py = mariosFactory.make(ui.height(), ui.outputMethod()); // Creating pyramid      
	py.postOutput(); // Outputting the pyramid, using the method selected
        System.out.println(py.toString());
    }
}
