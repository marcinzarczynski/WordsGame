package game_mode;

import words.Word;
import words.WordsCreator;

import java.util.ArrayList;
import java.util.List;


class HardMode implements GameMode {

    private static final int PROPORTION_OF_HARD_MODE = 8;
    private final WordsCreator wordsCreator;
    private List<Word> hardModWords = new ArrayList<>();
    private List<Word> words = new ArrayList<>();

    public HardMode(WordsCreator wordsCreator) {
        this.wordsCreator = wordsCreator;
        this.words = getProportionHardModWords();
        this.hardModWords = words;
    }

    @Override
    public List<Word> words() {
        return hardModWords;
    }

    private List<Word> getProportionHardModWords(){
        setProportionEasyWords();
        setProportionMediumWords();
        setProportionHardWords();
        return words;
    }

    private void setProportionEasyWords() {
        for (int i = 0; i < PROPORTION_OF_HARD_MODE; i++) {
            words.add(RandomWord.getRandomItem(PROPORTION_OF_HARD_MODE-i,wordsCreator.getWordsEasy()));
        }
    }

    private void setProportionMediumWords() {
        for (int i = 0; i < PROPORTION_OF_HARD_MODE; i++) {
            words.add(RandomWord.getRandomItem(PROPORTION_OF_HARD_MODE-i,wordsCreator.getWordsMedium()));
        }
    }

    private void setProportionHardWords() {
        for (int i = 0; i < PROPORTION_OF_HARD_MODE; i++) {
            words.add(RandomWord.getRandomItem(PROPORTION_OF_HARD_MODE-i,wordsCreator.getWordsHard()));
        }
    }
}
