package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] row = {board[value][0], board[value][1], board[value][2]};
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = {board[0][value], board[1][value], board[2][value]};
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return (getRow(rowIndex)[0].equals("X") && getRow(rowIndex)[1].equals("X") && getRow(rowIndex)[2].equals("X")) ||
                (getRow(rowIndex)[0].equals("O") && getRow(rowIndex)[1].equals("O") && getRow(rowIndex)[2].equals("O"));
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        return (getColumn(columnIndex)[0].equals("X") && getColumn(columnIndex)[1].equals("X") && getColumn(columnIndex)[2].equals("X")) ||
                (getColumn(columnIndex)[0].equals("O") && getColumn(columnIndex)[1].equals("O") && getColumn(columnIndex)[2].equals("O"));

    }

    public Boolean isDiagonalHomogeneous() {
        return ((board[0][0] == "X") && (board[1][1] == "X") && (board[2][2] == "X"))
                || ((board[0][2] == "X") & (board[1][1] == "X") & (board[2][0] == "X")) ||
        ((board[0][0] == "O") && (board[1][1] == "O") && (board[2][2] == "O"))
                || ((board[0][2] == "O") & (board[1][1] == "O") & (board[2][0] == "O"));
    }

    public String getWinner() {
        String result = "";
        for (int i = 0; i < 3; i++) {
           if(isRowHomogenous(i))
               result = getRow(i)[0];
           if(isColumnHomogeneous(i))
               result = getColumn(i)[0];
           if(isDiagonalHomogeneous())
            result = getRow(1)[1];
        }
        return result;
    }

    public String[][] getBoard() {
        return board;
    }
}
