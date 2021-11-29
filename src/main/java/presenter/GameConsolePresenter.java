package presenter;

import game.GameMenager;

public class GameConsolePresenter implements Presenter {

    final GameMenager gameMenager;
    public String currentLettersFromRequest = "";

    public GameConsolePresenter(GameMenager gameMenager){
        this.gameMenager = gameMenager;
    }

    @Override
    public void showGame(){
        currentLettersFromRequest = gameMenager.giveHint();
        System.out.println(currentLettersFromRequest);
        currentLettersFromRequest = gameMenager.giveHint();
        System.out.println(currentLettersFromRequest);
        currentLettersFromRequest = gameMenager.giveHint();
        System.out.println(currentLettersFromRequest);
        currentLettersFromRequest = gameMenager.giveHint();
        System.out.println(currentLettersFromRequest);
    }
    //Wyświetlanie slowek
    //Wyświetlanie czy odpowiedz byla dobra lub zła
    //Wyświetlanie podpowiedzi
    //Wyswietlanie ilosci punktow
    //wyswietlanie ostatecznego wyniku uzytkownika na danym poziomie
}
