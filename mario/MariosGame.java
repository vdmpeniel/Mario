package mario;
public class MariosGame {   
    MarioSingleton mainCharacter;
    UserInterface ui;
    MariosGame(MarioSingleton mainCharacter, UserInterface ui){
        this.mainCharacter = mainCharacter;
        this.ui = ui; // Calling UI 
    }
    public static void  main(String[] args){
        MariosGame newGame = new MariosGame(MarioSingleton.getInstance(), new UserInterface());
        newGame.play();
    }
    
    public void play(){              
        mainCharacter.makePyramid(ui.height(), ui.outputMethod()); 
        //System.out.println("This object have an ID od: " + System.identityHashCode(mario));
    }
}
