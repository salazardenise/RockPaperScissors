package game;

import helper.Constants;
import helper.Prompter;
import helper.Validator;
import java.util.ArrayList;
import java.util.Scanner;

public class GameDriver {

    private ArrayList<GameState> games;

    public GameDriver() {
        games = new ArrayList<>();
    }

    protected void drive() {
        Scanner scan = new Scanner(System.in);
        String menuChoice;
        do {
            // STEP 1: prompt menu to player
            menuChoice = Prompter.promptMenu(scan);
            // menu choice - quit
            if (menuChoice.equals(Constants.QUIT)) break;
            // menu choice - show history
            if (menuChoice.equals(Constants.HISTORY)) {
                displayHistory();
                continue;
            }

            // STEP 2: prompt player for game decision, set up, and play
            Player player1 = setupPlayer1(scan);
            if (player1.getChoice().equals(Constants.QUIT)) continue;
            Player player2 = setupPlayer2(menuChoice, scan);
            if (player2.getChoice().equals(Constants.QUIT)) continue;

            // STEP 3: determine winner and display
            determineWinner(player1, player2);
            GameState game = new GameState(player1, player2);
            game.descriptiveGameDispaly();
            games.add(game);
        } while (Validator.validateMenuChoice(menuChoice));
        scan.close();
    }

    private Player setupPlayer1(Scanner scan) {
        Player player1 = new Player(Constants.PLAYER_1);
        player1.play(scan);
        return player1;
    }

    private Player setupPlayer2(String menuChoice, Scanner scan) {
        Player player2 = null;
        // menu choice - play human
        if (menuChoice.equals(Constants.PLAY_HUMAN)) {
            player2 = new Player(Constants.PLAYER_2);
            player2.play(scan);
        }
        // menu choice - play computer
        if (menuChoice.equals(Constants.PLAY_COMPUTER)) {
            player2 = new Player(Constants.COMPUTER);
            player2.play();
        }
        return player2;
    }

    public void determineWinner(Player player1, Player player2) {
        String p1Choice = player1.getChoice();
        String p2Choice = player2.getChoice();
        if ((p1Choice.equals(Constants.ROCK) && p2Choice.equals(Constants.ROCK)) ||
                (p1Choice.equals(Constants.PAPER) && p2Choice.equals(Constants.PAPER)) ||
                (p1Choice.equals(Constants.SCISSORS) && p2Choice.equals(Constants.SCISSORS))) {
            player1.setStatus(Constants.TIE);
            player2.setStatus(Constants.TIE);
        } else if ((p1Choice.equals(Constants.ROCK) && p2Choice.equals(Constants.SCISSORS)) ||
                (p1Choice.equals(Constants.PAPER) && p2Choice.equals(Constants.ROCK)) ||
                (p1Choice.equals(Constants.SCISSORS) && p2Choice.equals(Constants.PAPER))) {
            player1.setStatus(Constants.WIN);
            player2.setStatus(Constants.LOSS);
        } else {
            player1.setStatus(Constants.LOSS);
            player2.setStatus(Constants.WIN);
        }
    }

    private void displayHistory() {
        System.out.println("=== GAME HISTORY ===");
        for (GameState game : games) {
            System.out.println(game);
        }
        System.out.println();
    }
}
