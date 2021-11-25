package game_mode;


import words.Word;
import words.WordsCreator;

import java.util.ArrayList;
import java.util.List;


class MidMode implements GameMode {

    private static final int PROPORTION_OF_MID_MODE = 12;
    private final WordsCreator wordsCreator;
    private List<Word> midModWords = new ArrayList<>();
    private List<Word> words = new ArrayList<>();

    public MidMode(WordsCreator wordsCreator) {
        this.wordsCreator = wordsCreator;
        this.words = getProportionMidModWords();
        this.midModWords = words;
    }

    @Override
    public List<Word> words() { return midModWords; }

    private List<Word> getProportionMidModWords(){
        setProportionEasyWords();
        setProportionMediumWords();
        return words;
    }

    private void setProportionEasyWords() {
        for (int i = 0; i < PROPORTION_OF_MID_MODE; i++) {
           words.add(RandomWord.getRandomItem(PROPORTION_OF_MID_MODE-i,wordsCreator.getWordsEasy()));
        }
    }

    private void setProportionMediumWords() {
        for (int i = 0; i < PROPORTION_OF_MID_MODE; i++) {
            words.add(RandomWord.getRandomItem(PROPORTION_OF_MID_MODE-i,wordsCreator.getWordsMedium()));
        }
    }
}
