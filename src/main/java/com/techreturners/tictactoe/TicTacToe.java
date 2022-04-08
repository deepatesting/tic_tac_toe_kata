package com.techreturners.tictactoe;

import java.util.*;

public class TicTacToe {

    //char[][] board = new char[3][3];
    int countplayerOne = 0;

    public String play(int[][] board){

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    countplayerOne++;
                    if (countplayerOne==3)
                        return "Player 1 wins!";
                }

            }
        }
        return null;
    }
}
