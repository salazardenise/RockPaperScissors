package game;

import helper.Constants;
import helper.Prompter;
import java.util.Scanner;

public class Player {
    private String type;
    private String status;
    private String choice;

    public Player (String type) {
        this.type = type;
        status = Constants.UNKNOWN;
        choice = Constants.INVALID;
    }

    public void play(Scanner scan) {
        System.out.println(type + " turn:");
        choice = Prompter.promptPlayer(scan);
    }

    public String play() {
        // randomly choose 'rock' or 'paper' or 'scissors'
        int num = (int) (Math.random()*3);
        String str;
        switch (num) {
            case 0:
                str = Constants.ROCK;
                break;
            case 1:
                str = Constants.PAPER;
                break;
            default:
                str = Constants.SCISSORS;
        }
        setChoice(str);
        return str;
    }

    public String getType() {
        return type;
    }

    public String getChoice() {
        return choice;
    }

    protected void setChoice(String choice) {
        this.choice = choice.toLowerCase();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return type + "-" + choice;
    }
}