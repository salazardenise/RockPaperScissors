package test;

import game.GameState;
import game.Player;
import helper.Constants;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.*;

public class testGameState {

    private Player player1 = new Player(Constants.PLAYER_1);
    private Player player2 = new Player(Constants.PLAYER_2);

    @Test
    public void testGameStateConstructedBeforeWinnerDetermined() {
        GameState game = new GameState(player1, player2);
        assertEquals(Constants.UNKNOWN, game.getStatus());
    }

    @Test
    public void testGameStateConstructedAfterPlays() {
        player1.play(new Scanner(Constants.PAPER));
        player2.play(new Scanner(Constants.SCISSORS));
        player1.setStatus(Constants.WIN);
        player2.setStatus(Constants.LOSS);
        GameState game = new GameState(player1, player2);
        assertEquals(Constants.WIN, game.getStatus());
    }

}
