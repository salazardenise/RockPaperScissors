package test;

import helper.Constants;
import helper.Prompter;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.*;

public class testPrompter {

    @Test
    public void testPromptMenu() {
        String expectedPlayHuman = Constants.PLAY_HUMAN;
        Scanner scan1 = new Scanner("play human");
        String actualPlayHuman1 = Prompter.promptMenu(scan1);
        scan1.close();
        assertEquals(expectedPlayHuman, actualPlayHuman1);

        Scanner scan2 = new Scanner("kolala\nplay human");
        String actualPlayHuman2 = Prompter.promptMenu(scan2);
        scan2.close();
        assertEquals(expectedPlayHuman, actualPlayHuman2);

        Scanner scan3 = new Scanner(" \nplay human");
        String actualPlayHuman3 = Prompter.promptMenu(scan3);
        scan3.close();
        assertEquals(expectedPlayHuman, actualPlayHuman3);

        String expectedPlayComputer = Constants.PLAY_COMPUTER;
        Scanner scan4 = new Scanner("play computer");
        String actualPlayComputer1 = Prompter.promptMenu(scan4);
        scan4.close();
        assertEquals(expectedPlayComputer, actualPlayComputer1);

        Scanner scan5 = new Scanner("koala\nplay computer");
        String actualPlayComputer2 = Prompter.promptMenu(scan5);
        scan5.close();
        assertEquals(expectedPlayComputer, actualPlayComputer2);

        Scanner scan6 = new Scanner(" \nplay computer");
        String actualPlayComputer3 = Prompter.promptMenu(scan6);
        scan6.close();
        assertEquals(expectedPlayComputer, actualPlayComputer3);

        String expectedHistory = Constants.HISTORY;
        Scanner scan7 = new Scanner("history");
        String actualHistory1 = Prompter.promptMenu(scan7);
        scan7.close();
        assertEquals(expectedHistory, actualHistory1);

        Scanner scan8 = new Scanner("koala\nhistory");
        String actualHistory2 = Prompter.promptMenu(scan8);
        scan8.close();
        assertEquals(expectedHistory, actualHistory2);

        Scanner scan9 = new Scanner(" \nhistory");
        String actualHistory3 = Prompter.promptMenu(scan9);
        scan9.close();
        assertEquals(expectedHistory, actualHistory3);

        String expectedQuit = Constants.QUIT;
        Scanner scan10 = new Scanner("quit");
        String actualQuit1 = Prompter.promptMenu(scan10);
        scan10.close();
        assertEquals(expectedQuit, actualQuit1);

        Scanner scan11 = new Scanner("koala\nquit");
        String actualQuit2 = Prompter.promptMenu(scan11);
        scan11.close();
        assertEquals(expectedQuit, actualQuit2);

        Scanner scan12 = new Scanner(" \nquit");
        String actualQuit3 = Prompter.promptMenu(scan12);
        scan12.close();
        assertEquals(expectedQuit, actualQuit3);
    }

    @Test
    public void testPromptPlayer() {
        String expectedRock = Constants.ROCK;
        Scanner scan1 = new Scanner("rock");
        String actualRock1 = Prompter.promptPlayer(scan1);
        scan1.close();
        assertEquals(expectedRock, actualRock1);

        Scanner scan2 = new Scanner("koala\nrock");
        String actualRock2 = Prompter.promptPlayer(scan2);
        scan2.close();
        assertEquals(expectedRock, actualRock2);

        Scanner scan3 = new Scanner(" \nrock");
        String actualRock3 = Prompter.promptPlayer(scan3);
        scan3.close();
        assertEquals(expectedRock, actualRock3);

        String expectedPaper = Constants.PAPER;
        Scanner scan4 = new Scanner("paper");
        String actualPaper1 = Prompter.promptPlayer(scan4);
        scan4.close();
        assertEquals(expectedPaper, actualPaper1);

        Scanner scan5 = new Scanner("koala\npaper");
        String actualPaper2 = Prompter.promptPlayer(scan5);
        scan5.close();
        assertEquals(expectedPaper, actualPaper2);

        Scanner scan6 = new Scanner(" \npaper");
        String actualPaper3 = Prompter.promptPlayer(scan6);
        scan6.close();
        assertEquals(expectedPaper, actualPaper3);

        String expectedScissors = Constants.SCISSORS;
        Scanner scan7 = new Scanner("scissors");
        String actualScissors1 = Prompter.promptPlayer(scan7);
        scan7.close();
        assertEquals(expectedScissors, actualScissors1);

        Scanner scan8 = new Scanner("koala\nscissors");
        String actualScissors2 = Prompter.promptPlayer(scan8);
        scan8.close();
        assertEquals(expectedScissors, actualScissors2);

        Scanner scan9 = new Scanner(" \nscissors");
        String actualScissors3 = Prompter.promptPlayer(scan9);
        scan9.close();
        assertEquals(expectedScissors, actualScissors3);

        String expectedQuit = Constants.QUIT;
        Scanner scan10 = new Scanner("quit");
        String actualQuit1 = Prompter.promptPlayer(scan10);
        scan10.close();
        assertEquals(expectedQuit, actualQuit1);

        Scanner scan11 = new Scanner("koala\nquit");
        String actualQuit2 = Prompter.promptPlayer(scan11);
        scan11.close();
        assertEquals(expectedQuit, actualQuit2);

        Scanner scan12 = new Scanner(" \nquit");
        String actualQuit3 = Prompter.promptPlayer(scan12);
        scan12.close();
        assertEquals(expectedQuit, actualQuit3);

    }
}
