package words;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.io.PipedInputStream;
import java.util.*;

@ExtendWith(MockitoExtension.class)
public class WordsCreatorTest {

    @Mock
    private WordsCollector wordsCollector;

    @InjectMocks
    private WordsCreator sut;

    private Map<String, String> createEasyWords() {
        Map<String, String> words = new HashMap<>();
        words.put("apple", "jabłko");
        words.put("wood", "drewno");
        words.put("stone", "kamień");
        words.put("castle", "zamek");
        return words;
    }

    @Test
    void shouldCreateWordsEasy() throws IOException {
        Mockito.when(wordsCollector.getEasyWords()).thenReturn(createEasyWords());
        List<Word> result = sut.getWordsEasy();
        List<Word> expectedWords = Arrays.asList(new Word("apple", "jabłko", Point.EASY),
                new Word("wood", "drewno", Point.EASY),
                new Word("stone", "kamień", Point.EASY),
                new Word("castle", "zamek", Point.EASY));
        Assertions.assertNotNull(result);
        Assertions.assertTrue(expectedWords.containsAll(result));
    }

    private Map<String, String> createMediumWords() {
        Map<String, String> words = new HashMap<>();
        words.put("pull", "ciągnąć");
        words.put("push", "pchać");
        words.put("slow", "wolno");
        words.put("fast", "szybko");
        return words;
    }

    @Test
    void shouldCreateWordsMedium() throws IOException {
        Mockito.when(wordsCollector.getMediumWords()).thenReturn(createMediumWords());
        List<Word> result = sut.getWordsMedium();
        List<Word> expectedWords = Arrays.asList(new Word("pull", "ciągnąć", Point.MID),
                new Word("push", "pchać", Point.MID),
                new Word("slow", "wolno", Point.MID),
                new Word("fast", "szybko", Point.MID));
        Assertions.assertNotNull(result);
        Assertions.assertTrue(expectedWords.containsAll(result));
    }

    private Map<String, String> createHardWords() {
        Map<String, String> words = new HashMap<>();
        words.put("responsible", "odpowiedzialny");
        words.put("reliable", "solidny");
        words.put("embarrassed", "zawstydzony");
        words.put("abashed", "speszony");
        return words;
    }

    @Test
    void shouldCreateWordsHard() throws IOException {
        Mockito.when(wordsCollector.getHardWords()).thenReturn(createHardWords());
        List<Word> result = sut.getWordsHard();
        List<Word> expectedWords = Arrays.asList(new Word("responsible", "odpowiedzialny", Point.HARD),
                new Word("reliable", "solidny", Point.HARD),
                new Word("embarrassed", "zawstydzony", Point.HARD),
                new Word("abashed", "speszony", Point.HARD));
        Assertions.assertNotNull(result);
        Assertions.assertTrue(expectedWords.containsAll(result));
    }

}