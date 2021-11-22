package game_mode;

import org.junit.jupiter.api.Assertions;
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
class MidModeTest {

    @Mock
    private WordsCreator wordsCreator;

    @InjectMocks
    private MidMode sut;

    private List<Word> createWords(Point point, int size) {
        List<Word> wordsAll = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (point == Point.EASY) {
                wordsAll.add(new Word("easy", "łatwo", Point.EASY));
            } else {
                wordsAll.add(new Word("mid", "średni", Point.MID));
            }
        }
        return wordsAll;
    }

    @Test
    void shouldCreateHardMod() {
        Mockito.when(wordsCreator.getWordsEasy()).thenReturn(createWords(Point.EASY, 25));
        Mockito.when(wordsCreator.getWordsMedium()).thenReturn(createWords(Point.MID, 25));

        List<Word> result = sut.words();
        List<Word> expectedWords = createWords(Point.EASY, 12);
        expectedWords.addAll(createWords(Point.MID, 12));

        Assertions.assertNotNull(result);
        Assertions.assertTrue(expectedWords.containsAll(expectedWords));

    }

}