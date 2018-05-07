package helper;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Prompter {

    public static String promptMenu(Scanner scan) {
        boolean choiceGood = false;
        String str = "";
        while (!choiceGood) {
            System.out.println("Welcome to Rock Paper Scissors!\n");
            System.out.println("MAIN MENU");
            System.out.println("====");
            System.out.println("1. Type 'play human' for a 2-player game");
            System.out.println("2. Type 'play computer' to play the computer");
            System.out.println("3. Type 'history' to view your game history");
            System.out.println("4. Type 'quit' to stop playing");
            System.out.println();
            str = scanLine(scan);
            choiceGood = Validator.validateMenuChoice(str);
            if (!choiceGood) {
                System.out.println("Error: choose from the following menu options");
            }
        }
        return str;
    }

    public static String promptPlayer(Scanner scan) {
        boolean choiceGood = false;
        String str = "";
        while (!choiceGood){
            System.out.println("Type in 'rock' 'paper' or 'scissors' to play.");
            System.out.println("   Type in 'quit' to go back to the Main Menu");
            System.out.println();
            str = scanLine(scan);
            choiceGood = Validator.validatePlayerChoice(str);
            if (!choiceGood) {
                System.out.println("Error: choose from the following player options");
            }
        }
        return str;
    }

    private static String scanLine(Scanner scan) {
        String str = "";
        try {
            str = scan.nextLine().toLowerCase().trim();
        } catch (NoSuchElementException e) {
            System.out.println("Error: no line was found");
            e.printStackTrace();
        } catch (IllegalStateException e) {
            System.out.println("Error: scanner is closed");
            e.printStackTrace();
        }
        return str;
    }

}