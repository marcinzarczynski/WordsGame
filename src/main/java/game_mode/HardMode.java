package game_mode;

import words.Word;
import words.WordsCreator;

import java.util.ArrayList;
import java.util.List;


class HardMode implements GameMode {

    private static final int PROPORTION_OF_HARD_MODE = 8;
    private final WordsCreator wordsCreator;
    private final List<Word> hardModWords = new ArrayList<>();

    public HardMode(WordsCreator wordsCreator) {
        this.wordsCreator = wordsCreator;
    }

    @Override
    public List<Word> words() {
        setProportionHardWords();
        return null;
    }

    private void setProportionEasyWords() {
        for (int i = 0; i < PROPORTION_OF_HARD_MODE; i++) {
            hardModWords.add(RandomWord.getRandomItem(PROPORTION_OF_HARD_MODE-i,wordsCreator.getWordsEasy()));
        }
    }

    private void setProportionMediumWords() {
        for (int i = 0; i < PROPORTION_OF_HARD_MODE; i++) {
            hardModWords.add(RandomWord.getRandomItem(PROPORTION_OF_HARD_MODE-i,wordsCreator.getWordsMedium()));
        }
    }

    private void setProportionHardWords() {
        for (int i = 0; i < PROPORTION_OF_HARD_MODE; i++) {
            hardModWords.add(RandomWord.getRandomItem(PROPORTION_OF_HARD_MODE-i,wordsCreator.getWordsHard()));
        }
    }
}
