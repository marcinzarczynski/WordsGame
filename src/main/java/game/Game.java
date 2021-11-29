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
    private int points = 0;
    private int numberOfReqLetters = 0;

    public Game(String level, WordsCreator wordsCreator) throws IOException {
        this.gameMode = GameModeFactory.selectGameMode(level, wordsCreator);
        currentWord = gameMode.words().get(0);
    }

    public void start() {
        //Pętla dla wszystkich slowek String line -
        // interfejs wyswietla slowka
        // next question(pyta answerIsGooodOrNo)
        // jesli dobra dodaje value jesli zla odejmuje
        // ewentualna mozliwosc podpowiedzi (potem dodam)
        // po skonczeniu slowek brake i GG WP
    }

    public Word getWord(int index) {
        Word wordFromGame = gameMode.words().get(index);
        Word word = new Word(wordFromGame.getEng(), wordFromGame.getPl(), wordFromGame.getValue());
        gameMode.words().remove(wordFromGame);
        return word;
    }
    //    public void nextQuestion{
//
//    }
    public boolean isGoodAnswer(String answer) {
        if (Objects.equals(answer, currentWord.getEng())) {
            points += currentWord.getValue().getValue();
            numberOfReqLetters = 0;
            return true;
        }
        points--; // this method shoudl do less. Refactor
        return false;
    }

    public char getLetter() {
        points--;
        return currentWord.getEng().charAt(numberOfReqLetters++);
    }

}
