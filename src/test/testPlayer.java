package test;

import game.Player;
import helper.Constants;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.*;

public class testPlayer {

    private Player player = new Player(Constants.PLAYER_1);
    private Player computer = new Player(Constants.COMPUTER);

    @Test
    public void testPlayerAfterConstruction() {
        assertEquals(Constants.PLAYER_1, player.getType());
        assertEquals(Constants.UNKNOWN, player.getStatus());
        assertEquals(Constants.INVALID, player.getChoice());
        assertEquals(Constants.PLAYER_1 + "-" + Constants.INVALID,
                player.toString());
    }

    @Test
    public void testComputerAfterConstruction() {
        assertEquals(Constants.COMPUTER, computer.getType());
        assertEquals(Constants.UNKNOWN, computer.getStatus());
        assertEquals(Constants.INVALID, computer.getChoice());
        assertEquals(Constants.COMPUTER + "-" + Constants.INVALID,
                computer.toString());
    }

    @Test
    public void testPlayForPlayer() {
        Scanner scan = new Scanner(Constants.PAPER);
        player.play(scan);
        assertEquals(Constants.PLAYER_1, player.getType());
        assertEquals(Constants.UNKNOWN, player.getStatus());
        assertEquals(Constants.PAPER, player.getChoice());
        assertEquals(Constants.PLAYER_1 + "-" + Constants.PAPER,
                player.toString());
    }

    @Test
    public void testPlayForComputer() {
        String choice = computer.play();
        assertEquals(Constants.COMPUTER, computer.getType());
        assertEquals(Constants.UNKNOWN, computer.getStatus());
        boolean validChoice = (choice.equals(Constants.ROCK) ||
                choice.equals(Constants.PAPER) ||
                choice.equals(Constants.SCISSORS));
        assertTrue(validChoice);
    }
}
