import game.Game;
import game.GameMenager;
import presenter.GameConsolePresenter;
import presenter.Presenter;
import words.WordsCollector;
import words.WordsCreator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WordsCollector wordsCollector = new WordsCollector();
        WordsCreator wordsCreator = new WordsCreator(wordsCollector);
        Game game = new Game("Easy", wordsCreator);
        GameMenager gameMenager = new GameMenager(game);
        Presenter presenter = new GameConsolePresenter(gameMenager);
        presenter.showGame();
    }
}
