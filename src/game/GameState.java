package game;

import helper.Constants;
import java.util.Date;

public class GameState {

    private Player player1;
    private Player player2;
    private String status;
    private Date date;

    public GameState(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.status = player1.getStatus();
        date = new Date();
    }

    public void setStatus(String status) {
        date = new Date();
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return date + ", " + status + ": " + player1 + " " + player2;
    }

    public void descriptiveGameDispaly() {
        System.out.println(player2.getType() + " picks: " + player2.getChoice());
        System.out.println(player1.getType() + " picks: " + player1.getChoice());
        String result;
        switch (player1.getStatus()) {
            case Constants.WIN:
                result = Constants.CURRENT_WIN;
                break;
            case Constants.LOSS:
                result = Constants.CURRENT_LOSE;
                break;
            default:
                result = Constants.CURRENT_TIE;
        }
        System.out.println("You " + result + "!\n");
    }
}
