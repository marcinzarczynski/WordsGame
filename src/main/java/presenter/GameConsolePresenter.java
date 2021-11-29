package presenter;

import game.Game;
import presenter.Presenter;

public class GameConsolePresenter implements Presenter {

    final Game game;
    public String currentLettersFromRequest;

    public GameConsolePresenter(Game game){
        this.game = game;
    }

    @Override
    public void showGame(){
        System.out.println(game.getWord(1));
        currentLettersFromRequest += game.getLetter();
        System.out.println(currentLettersFromRequest);
        currentLettersFromRequest += game.getLetter();
        System.out.println(currentLettersFromRequest);
        currentLettersFromRequest += game.getLetter();
        System.out.println(currentLettersFromRequest);
        currentLettersFromRequest += game.getLetter();
        System.out.println(currentLettersFromRequest);
    }
    //Wyświetlanie slowek
    //Wyświetlanie czy odpowiedz byla dobra lub zła
    //Wyświetlanie podpowiedzi
    //Wyswietlanie ilosci punktow
    //wyswietlanie ostatecznego wyniku uzytkownika na danym poziomie
}
