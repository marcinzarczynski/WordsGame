package game;

import words.Word;

public class GameMenager {

    final Game game;
    private int points = 0;
    private int numberOfHints = 0;
    private String currentHint = "";

    public GameMenager(Game game) {
        this.game = game;
    }


    //Pętla dla wszystkich slowek String line -
    // interfejs wyswietla slowka
    // next question(pyta answerIsGooodOrNo)
    // jesli dobra dodaje value jesli zla odejmuje
    // ewentualna mozliwosc podpowiedzi (potem dodam)
    // po skonczeniu slowek brake i GG WP

    public int getPoints() {
        return points;
    }

    public Word getCurrentWord() {
        return game.getCurrentWord();
    }

    public boolean checkAnswer(String answer) {
        if (game.isGoodAnswer(answer)) {
            points += game.getCurrentWord().getValue().getValue();
            return true;
        }
        points--;
        return false;
    }

    public String giveHint() {
        points--;
        currentHint += game.getCurrentWord().getPl().charAt(numberOfHints++);
        return currentHint;
    }
}
