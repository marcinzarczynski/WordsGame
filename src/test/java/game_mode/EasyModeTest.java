package game_mode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import words.Point;
import words.Word;
import words.WordsCreator;

import java.util.LinkedList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class EasyModeTest {

    @Mock
    private WordsCreator wordsCreator;

    private EasyMode sut;

    @BeforeEach
    public void setUp(){
        Mockito.when(wordsCreator.getWordsEasy()).thenReturn(createWords(Point.EASY,40));
        sut = new EasyMode(wordsCreator);
    }

    private List<Word> createWords(Point point,int size) {
        List<Word> wordsAll = new LinkedList<>();
        for (int i = 0; i < size; i++) {
                wordsAll.add(new Word("easy", "łatwo", Point.EASY));
        }
        return wordsAll;
    }

    @Test
    void shouldCreateEasyMod() {
        List<Word> result = sut.words();
        List<Word> expectedWords = createWords(Point.EASY, 24);

        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.containsAll(expectedWords));

    }

}
