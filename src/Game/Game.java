package Game;

import Engine.GameWindow;
import Engine.ScreenManager;
import Level.Audio;

/*
 * The game starts here
 * This class just starts up a GameWindow and attaches the ScreenCoordinator to the ScreenManager instance in the GameWindow
 * From this point on the ScreenCoordinator class will dictate what the game does
 */
public class Game {

    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        GameWindow gameWindow = new GameWindow();
        gameWindow.startGame();
        ScreenCoordinator screenCoordinator = new ScreenCoordinator();
        gameWindow.setScreenCoordinator(screenCoordinator);
        ScreenManager screenManager = gameWindow.getScreenManager();
        screenManager.setCurrentScreen(screenCoordinator);
        
        Audio.playAudio("theme.wav");
        
        
       
    }
}
