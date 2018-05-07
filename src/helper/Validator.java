package helper;

public class Validator {

    public static boolean validateMenuChoice(String str) {
        switch (str) {
            case Constants.PLAY_HUMAN:
            case Constants.PLAY_COMPUTER:
            case Constants.HISTORY:
            case Constants.QUIT:
                return true;
            default:
                return false;
        }
    }

    public static boolean validatePlayerChoice(String str) {
        switch (str) {
            case Constants.ROCK:
            case Constants.PAPER:
            case Constants.SCISSORS:
            case Constants.QUIT:
                return true;
            default:
                return false;
        }
    }

}
