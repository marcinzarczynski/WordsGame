import game.Game;
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
        Presenter presenter = new GameConsolePresenter(game);
        presenter.showGame();

        // tworzy tylko gre i daje start
    }
}
