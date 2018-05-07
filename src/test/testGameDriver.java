package test;

import game.GameDriver;
import game.GameState;
import game.Player;
import helper.Constants;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.*;

public class testGameDriver {

    private GameDriver gameDriver = new GameDriver();
    private Player player1 = new Player(Constants.PLAYER_1);
    private Player player2 = new Player(Constants.PLAYER_2);

    @Test
    public void testDetermineWinnerWin() {
        Scanner scan1 = new Scanner(Constants.PAPER);
        player1.play(scan1);
        scan1.close();
        Scanner scan2 = new Scanner(Constants.ROCK);
        player2.play(scan2);
        scan2.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState1 = new GameState(player1, player2);
        assertEquals(Constants.WIN, player1.getStatus());
        assertEquals(Constants.LOSS, player2.getStatus());
        assertEquals(Constants.WIN, gameState1.getStatus());

        Scanner scan3 = new Scanner(Constants.SCISSORS);
        player1.play(scan3);
        scan3.close();
        Scanner scan4 = new Scanner(Constants.PAPER);
        player2.play(scan4);
        scan4.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState2 = new GameState(player1, player2);
        assertEquals(Constants.WIN, player1.getStatus());
        assertEquals(Constants.LOSS, player2.getStatus());
        assertEquals(Constants.WIN, gameState2.getStatus());

        Scanner scan5 = new Scanner(Constants.ROCK);
        player1.play(scan5);
        scan5.close();
        Scanner scan6 = new Scanner(Constants.SCISSORS);
        player2.play(scan6);
        scan6.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState3 = new GameState(player1, player2);
        assertEquals(Constants.WIN, player1.getStatus());
        assertEquals(Constants.LOSS, player2.getStatus());
        assertEquals(Constants.WIN, gameState3.getStatus());
    }

    @Test
    public void tesetDetermineWinnerLoss() {
        Scanner scan1 = new Scanner(Constants.ROCK);
        player1.play(scan1);
        scan1.close();
        Scanner scan2 = new Scanner(Constants.PAPER);
        player2.play(scan2);
        scan2.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState1 = new GameState(player1, player2);
        assertEquals(Constants.LOSS, player1.getStatus());
        assertEquals(Constants.WIN, player2.getStatus());
        assertEquals(Constants.LOSS, gameState1.getStatus());

        Scanner scan3 = new Scanner(Constants.PAPER);
        player1.play(scan3);
        scan3.close();
        Scanner scan4 = new Scanner(Constants.SCISSORS);
        player2.play(scan4);
        scan4.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState2 = new GameState(player1, player2);
        assertEquals(Constants.LOSS, player1.getStatus());
        assertEquals(Constants.WIN, player2.getStatus());
        assertEquals(Constants.LOSS, gameState2.getStatus());

        Scanner scan5 = new Scanner(Constants.SCISSORS);
        player1.play(scan5);
        scan5.close();
        Scanner scan6 = new Scanner(Constants.ROCK);
        player2.play(scan6);
        scan6.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState3 = new GameState(player1, player2);
        assertEquals(Constants.LOSS, player1.getStatus());
        assertEquals(Constants.WIN, player2.getStatus());
        assertEquals(Constants.LOSS, gameState3.getStatus());
    }

    @Test
    public void testDetermineWinnerTie() {
        Scanner scan1 = new Scanner(Constants.PAPER);
        player1.play(scan1);
        scan1.close();
        Scanner scan2 = new Scanner(Constants.PAPER);
        player2.play(scan2);
        scan2.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState1 = new GameState(player1, player2);
        assertEquals(Constants.TIE, player1.getStatus());
        assertEquals(Constants.TIE, player2.getStatus());
        assertEquals(Constants.TIE, gameState1.getStatus());

        Scanner scan3 = new Scanner(Constants.SCISSORS);
        player1.play(scan3);
        scan3.close();
        Scanner scan4 = new Scanner(Constants.SCISSORS);
        player2.play(scan4);
        scan4.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState2 = new GameState(player1, player2);
        assertEquals(Constants.TIE, player1.getStatus());
        assertEquals(Constants.TIE, player2.getStatus());
        assertEquals(Constants.TIE, gameState2.getStatus());

        Scanner scan5 = new Scanner(Constants.ROCK);
        player1.play(scan5);
        scan5.close();
        Scanner scan6 = new Scanner(Constants.ROCK);
        player2.play(scan6);
        scan6.close();
        gameDriver.determineWinner(player1, player2);
        GameState gameState3 = new GameState(player1, player2);
        assertEquals(Constants.TIE, player1.getStatus());
        assertEquals(Constants.TIE, player2.getStatus());
        assertEquals(Constants.TIE, gameState3.getStatus());
    }
}
