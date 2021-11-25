package game_mode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import words.Point;
import words.Word;
import words.WordsCreator;

import java.util.LinkedList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class HardModeTest {

    @Mock
    private WordsCreator wordsCreator;

    private HardMode sut;

    @BeforeEach
    public void setUp(){
        Mockito.when(wordsCreator.getWordsEasy()).thenReturn(createWords(Point.EASY,20));
        Mockito.when(wordsCreator.getWordsMedium()).thenReturn(createWords(Point.MID,23));
        Mockito.when(wordsCreator.getWordsHard()).thenReturn(createWords(Point.HARD,15));
        sut = new HardMode(wordsCreator);
    }

    private List<Word> createWords(Point point, int size) {
        List<Word> wordsAll = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (point == Point.EASY) {
                wordsAll.add(new Word("easy", "łatwo", Point.EASY));
            } else if (point == Point.MID) {
                wordsAll.add(new Word("mid", "średni", Point.MID));
            } else {
                wordsAll.add(new Word("hard", "trudny", Point.HARD));
            }

        }
        return wordsAll;
    }

    @Test
    void shouldCreateHardMod() {
        List<Word> result = sut.words();
        List<Word> expectedWords = createWords(Point.EASY, 8);
        expectedWords.addAll(createWords(Point.MID, 8));
        expectedWords.addAll(createWords(Point.HARD, 8));

        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.containsAll(expectedWords));
    }
}