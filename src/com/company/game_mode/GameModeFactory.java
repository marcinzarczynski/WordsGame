package com.company.game_mode;


public class GameModeFactory {
    public static GameMode selectGameMode(String level) {
        if (level.equals("Easy")) {
            return new EasyMode();
        } else if (level.equals("Mid")) {
            return new MidMode();
        } else {
            return new HardMode();
        }
    }
}
