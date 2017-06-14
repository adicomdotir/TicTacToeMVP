package ir.adicom.app.mvptictactoe.views;

/**
 *
 * Created by adicom on 6/14/17.
 */
public interface TicTacToeView {
    void showWinner(String winningPlayerDisplayLabel);
    void clearWinnerDisplay();
    void clearButtons();
    void setButtonText(int row, int col, String text);
}
