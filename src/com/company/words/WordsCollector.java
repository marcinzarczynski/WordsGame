package com.company.words;

import com.company.downloader.DownloaderFactory;

import java.util.HashMap;
import java.util.Map;


class WordsCollector {

    private Map<String, String> easyWords = new HashMap<>();
    private Map<String, String> mediumWords = new HashMap<>();
    private Map<String, String> hardWords = new HashMap<>();

    public WordsCollector() {
        easyWords = DownloaderFactory.buildDownloader("txt").Download("wordsEasy.txt");
        mediumWords = DownloaderFactory.buildDownloader("txt").Download("mediumEasy.txt");
        hardWords = DownloaderFactory.buildDownloader("txt").Download("hardEasy.txt");
    }

    Map<String, String> getEasyWords() {
        return easyWords;
    }

    Map<String, String> getMediumWords() {
        return mediumWords;
    }

    Map<String, String> getHardWords() {
        return hardWords;
    }
}
