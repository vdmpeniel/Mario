//THIS IS THE COMMIT FOR FIXED CONFLICTS
package mario;
public class MariosGame {   
    public static void  main(String[] args){
        UserInterface ui;
        ui = new UserInterface(); // Calling UI
        
        MarioSingleton mario = MarioSingleton.getInstance();
        mario.makePyramid(ui.height(), ui.outputMethod()); 
        System.out.println("This object have an ID od: " + System.identityHashCode(mario));
        
        //MarioSingleton lolo = MarioSingleton.getInstance();
        //System.out.println("This object have an ID od: " + System.identityHashCode(lolo));
    }
}
