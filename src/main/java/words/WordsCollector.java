package words;

import downloader.DownloaderFactory;

import java.io.IOException;
import java.util.Map;

class WordsCollector {

    final private Map<String, String> easyWords;
    final private Map<String, String> mediumWords;
    final private Map<String, String> hardWords;

    public WordsCollector() throws IOException {
        easyWords = DownloaderFactory.buildDownloader("txt").download("wordsEasy.txt");
        mediumWords = DownloaderFactory.buildDownloader("txt").download("mediumEasy.txt");
        hardWords = DownloaderFactory.buildDownloader("txt").download("hardEasy.txt");
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
