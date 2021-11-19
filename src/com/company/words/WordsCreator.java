package com.company.words;

import com.company.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WordsCreator {

    WordsCollector wordsCollector = new WordsCollector();

    public List<Word> getWordsEasy(){

        return createWords(Point.EASY,wordsCollector.getEasyWords());
    }
    public List<Word> getWordsMedium(){

        return createWords(Point.MID,wordsCollector.getMediumWords());
    }
    public List<Word> getWordsHard(){

        return createWords(Point.HARD,wordsCollector.getHardWords());
    }

    private List<Word> createWords(Point point, Map<String,String> wordsMap){
        List<Word> words = new ArrayList<>();

        for(Map.Entry<String,String>entry : wordsMap.entrySet()){
            words.add(new Word(entry.getKey(), entry.getValue(), point));
        }
        return words;
    }


}