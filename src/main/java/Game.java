import game_mode.GameMode;
import game_mode.GameModeFactory;
import words.WordsCreator;

public class Game {

private final GameMode gameMode;


    public Game(GameMode gamemode){
        this.gameMode = gamemode;
    }

    public void start(){
        GameMode gameMode = GameModeFactory.selectGameMode("Easy");
    }

//    public void nextQuestion{
//
//    }
//    public void answerIsGoodOrNo{
//
//    }

}
