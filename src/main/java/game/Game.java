package game;

import game_mode.GameMode;
import game_mode.GameModeFactory;
import words.Word;
import words.WordsCreator;

import java.io.IOException;
import java.util.Objects;

public class Game {

    private final GameMode gameMode;
    private Word currentWord;

    public Game(String level, WordsCreator wordsCreator) throws IOException {
        this.gameMode = GameModeFactory.selectGameMode(level, wordsCreator);
        currentWord = getWord(0);
    }

    private Word getWord(int index) {
        Word wordFromGame = gameMode.words().get(index);
        Word word = new Word(wordFromGame.getEng(), wordFromGame.getPl(), wordFromGame.getValue());
        gameMode.words().remove(wordFromGame);
        return word;
    }

    public void setNewCurrentWord() {
        currentWord = getWord(0);
    }

    public Word getCurrentWord() {
        return currentWord;
    }

    public boolean isGoodAnswer(String answer) {
        if (Objects.equals(answer, currentWord.getEng())) {
            return true;
        }
        return false;
    }
}
