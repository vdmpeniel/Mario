package mario;
public class MariosGame {   
    MarioSingleton mainCharacter;
    MariosGame(MarioSingleton mainCharacter){
        this.mainCharacter = mainCharacter;
    }
    public static void  main(String[] args){
        MariosGame newGame = new MariosGame(MarioSingleton.getInstance());
        newGame.play();
    }
    
    public void play(){
        UserInterface ui;
        ui = new UserInterface(); // Calling UI       
        mainCharacter.makePyramid(ui.height(), ui.outputMethod()); 
        //System.out.println("This object have an ID od: " + System.identityHashCode(mario));
    }
}
