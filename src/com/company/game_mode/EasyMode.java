package com.company.game_mode;

import com.company.words.Word;
import com.company.words.WordsCreator;

import java.util.ArrayList;
import java.util.List;

class EasyMode implements GameMode {
    private static final int PROPORTION_OF_EASY_MODE = 24;
    private final WordsCreator wordsCreator = new WordsCreator();
    private final List<Word> easyModWords = new ArrayList<>();

    @Override
    public List<Word> words() {
        setProportioneasyModWords();
        return easyModWords;
    }

    private void setProportioneasyModWords() {
        for (int i = 0; i < PROPORTION_OF_EASY_MODE; i++) {
            easyModWords.add(RandomWord.getRandomItem(PROPORTION_OF_EASY_MODE - i, wordsCreator.getWordsEasy()));
        }
    }
}
