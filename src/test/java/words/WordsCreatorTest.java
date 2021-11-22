package words;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class WordsCreatorTest {

    @Mock
    private WordsCollector wordsCollector;

    @InjectMocks
    private WordsCreator sut;

    private Map<String,String> createEasyWords(){
        Map<String,String> words = new HashMap<>();
        words.put("apple","jabłko");
        words.put("wood","drewno");
        words.put("stone","kamień");
        words.put("castle","zamek");
        return words;
    }

    @Test
    void shouldCreateWordsEasy() throws IOException {
        Mockito.when(wordsCollector.getEasyWords()).thenReturn(createEasyWords());
        List<Word> result = sut.getWordsEasy();
        int x=5+5;
    }
}