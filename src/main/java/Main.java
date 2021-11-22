import game_mode.GameMode;
import game_mode.GameModeFactory;
import words.WordsCollector;
import words.WordsCreator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WordsCollector  wordsCollector = new WordsCollector();
        WordsCreator wordsCreator = new WordsCreator(wordsCollector);
        GameMode gameMode = GameModeFactory.selectGameMode("MID",wordsCreator);
        Game game = new Game(gameMode);
    }
}
