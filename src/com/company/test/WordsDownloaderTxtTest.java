package com.company.test;

import com.company.downloader.WordsDownloaderTxt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordsDownloaderTxtTest {

    private WordsDownloaderTxt sut = new WordsDownloaderTxt();

    @Test
    void shouldDownloadWordsFromTxtEasy() throws IOException {
        Map<String, String> result = sut
                .download("src\\com\\company\\test\\wordsEasy.txt");
        Map<String,String> expectedWords = new HashMap<>();
        expectedWords.put("apple","jabłko");
        expectedWords.put("wood","drewno");
        expectedWords.put("stone","kamień");
        expectedWords.put("castle","zamek");

        Assertions.assertEquals(4,result.size());
        Assertions.assertEquals(expectedWords,result);
    }
    @Test
    void shouldNotFindFile (){
        FileNotFoundException thrown = assertThrows(FileNotFoundException.class,
                () ->sut.download("C:\\Usrs\\Marcin\\src\\comy\\test\\wordsEasy.txt"));
    }
}