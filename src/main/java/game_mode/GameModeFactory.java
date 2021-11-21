package game_mode;


import words.WordsCreator;

public class GameModeFactory {
    public static GameMode selectGameMode(String level, WordsCreator wordsCreator) {
        if (level.equals("Easy")) {
            return new EasyMode(wordsCreator);
        } else if (level.equals("Mid")) {
            return new MidMode(wordsCreator);
        } else {
            return new HardMode(wordsCreator);
        }
    }
}
