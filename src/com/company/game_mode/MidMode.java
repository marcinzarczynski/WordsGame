package com.company.game_mode;

import com.company.words.Word;
import com.company.words.WordsCreator;

import java.util.ArrayList;
import java.util.List;


class MidMode implements GameMode {
    private static final int PROPORTION_OF_MID_MODE = 12;
    private final WordsCreator wordsCreator = new WordsCreator();
    private final List<Word> midModWords = new ArrayList<>();

    @Override
    public List<Word> words() {
        setProportionEasyWords();
        setProportionMediumWords();
        return midModWords;
    }

    private void setProportionEasyWords() {
        for (int i = 0; i < PROPORTION_OF_MID_MODE; i++) {
            midModWords.add(RandomWord.getRandomItem(PROPORTION_OF_MID_MODE-i,wordsCreator.getWordsEasy()));
        }
    }

    private void setProportionMediumWords() {
        for (int i = 0; i < PROPORTION_OF_MID_MODE; i++) {
            midModWords.add(RandomWord.getRandomItem(PROPORTION_OF_MID_MODE-i,wordsCreator.getWordsMedium()));
        }
    }

}
