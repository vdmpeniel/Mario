package com.vic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Game {
    private Mario mainCharacter;
    private UserInterface ui;

    public Game(Mario mainCharacter, UserInterface ui){
        this.mainCharacter = mainCharacter;
        this.ui = ui;
    }

    private void play(){
        mainCharacter.makePyramid(ui.height(),ui.outputMethod());
    }

    public static void  main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Game game = (Game) context.getBean("game");
        game.play();
    }
    

}
