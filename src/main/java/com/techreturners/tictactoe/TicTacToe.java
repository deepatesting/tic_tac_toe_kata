package com.techreturners.tictactoe;

import java.util.*;

public class TicTacToe {

    //char[][] board = new char[3][3];
    int countplayerOne = 0;
    int countplayerTwo = 0;

    public String play(int[][] board){

        if ((board[0][0] == 1) && (board[1][0] == 1) && (board[2][0] == 1))
        {
            return "Player 1 wins!";
        }

        if ((board[0][1] == 2) && (board[1][1] == 2) && (board[2][1] == 2))
        {
            return "Player 2 wins!";
        }
        return null;
    }
}
